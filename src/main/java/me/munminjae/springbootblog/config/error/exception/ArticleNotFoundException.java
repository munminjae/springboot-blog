package me.munminjae.springbootblog.config.error.exception;

import me.munminjae.springbootblog.config.error.ErrorCode;

public class ArticleNotFoundException extends NotFoundException {
    public ArticleNotFoundException() {
        super(ErrorCode.ARTICLE_NOT_FOUND);
    }
}