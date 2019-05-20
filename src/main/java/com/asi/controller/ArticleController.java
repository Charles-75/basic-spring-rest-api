package com.asi.controller;

import com.asi.model.Article;
import com.asi.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/send/article")
    public String sendArticle(Article article){

    }

}
