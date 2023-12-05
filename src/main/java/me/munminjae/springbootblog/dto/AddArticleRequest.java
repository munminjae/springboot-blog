package me.munminjae.springbootblog.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import me.munminjae.springbootblog.domain.Article;

@NoArgsConstructor  //기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddArticleRequest {

    @NotNull
    @Size(min = 1, max = 10)
    private String title;

    @NotNull
    private String content;

    public Article toEntity(String author) { // 생성자를 사용하여 객체 생성
        return Article.builder()
                .author(author)
                .title(title)
                .content(content)
                .build();
    }
}
