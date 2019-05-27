package com.asi.repository;

import com.asi.model.Article;
import com.asi.model.Section;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {

    List<Article> findAllBySection(Section section);

}
