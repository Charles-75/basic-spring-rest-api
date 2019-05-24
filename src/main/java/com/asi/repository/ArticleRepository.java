package com.asi.repository;

import com.asi.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends  JpaRepository<Article, Integer> {

    //void saveArticle(Article article);
}
