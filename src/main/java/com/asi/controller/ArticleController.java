package com.asi.controller;

import com.asi.service.ArticleService;
import com.asi.model.Article;
import com.asi.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private ArticleService articleService;
/*
    @PostMapping("/sendArticle")
    private String addArticle(@RequestBody Article article) {
        articleService.saveArticle(article);
        return "Ok";
    }
*/

    @GetMapping("/getArticle")
    private List<Article> getAll(){
        return articleService.findAll();
    }
}
