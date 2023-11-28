package me.munminjae.springbootblog.service;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.munminjae.springbootblog.domain.Article;
import me.munminjae.springbootblog.dto.AddArticleRequest;
import me.munminjae.springbootblog.dto.UpdateArticleRequest;
import me.munminjae.springbootblog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    //블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));
    }

    public void deleteById(long id) {
        blogRepository.deleteById(id);
    }

    @Transactional //트랜잭션 메서드
    public Article updateById(long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
            article.update(request.getTitle(), request.getContent());

            return article;
    }
}
