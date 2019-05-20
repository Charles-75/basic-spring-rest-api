package com.asi.Service;

import com.asi.model.Article;
import com.asi.repository.ArticleRepository;
import com.asi.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private SectionRepository sectionRepository;

    public void saveArticle(Article article){

        articleRepository.save(article);

    }

}
