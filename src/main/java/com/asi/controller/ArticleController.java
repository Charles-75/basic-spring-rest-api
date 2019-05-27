package com.asi.controller;

import com.asi.model.Section;
import com.asi.service.ArticleService;
import com.asi.model.Article;
import com.asi.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private SectionService sectionService;

    //Spring defaut port: 8080
    //The section parameter is a string, basically it's the section's name
    //For instance, localhost:8080/articles/1 will return all articles about the section of id 1.
    @RequestMapping(value = "/articles/{id}", method = RequestMethod.GET)
    private List<Article> getArticlesBySection(@PathVariable(value = "id") int id){
        Section section = sectionService.findById(id);
        return articleService.findAllBySection(section);
    }

    //Other endpoint that does the same thing as the previous endpoint except that instead of getting an id, it gets a name (string) as parameter
    //For instance, localhost:8080/getArticles?name=tech will return all articles about the section whose name is "tech"
    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    private List<Article> getSection(@RequestParam(value = "name") String name){
        Section section = sectionService.findByName(name);
        return articleService.findAllBySection(section);
    }

}
