package com.asi.service;

import com.asi.model.Article;
import com.asi.model.Section;
import com.asi.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> findAllBySection(Section section){
        return articleRepository.findAllBySection(section);
    }

}
