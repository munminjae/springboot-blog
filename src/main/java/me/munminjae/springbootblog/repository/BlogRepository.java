package me.munminjae.springbootblog.repository;

import me.munminjae.springbootblog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {}
