package me.munminjae.springbootblog.dto;

import lombok.Getter;
import me.munminjae.springbootblog.domain.Article;

@Getter
public class ArticleResponse {

    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }

}
