package com.asi.controller;

import com.asi.Service.ArticleService;
import com.asi.model.Article;
import com.asi.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private ArticleService articleService;

    @PostMapping("/sendArticle")
    private String addArticle(@RequestBody Article article) {
        articleService.saveArticle(article);
        return "Ok";
    }

}
