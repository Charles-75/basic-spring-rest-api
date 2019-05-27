package com.asi.repository;

import com.asi.model.Article;
import com.asi.model.Section;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends CrudRepository<Section, Integer> {

    Section findById(int id);
    Section findByName(String name);

}
