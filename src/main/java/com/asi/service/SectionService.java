package com.asi.service;

import com.asi.model.Section;
import com.asi.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SectionService {

    @Autowired
    private SectionRepository sectionRepository;

    public Section findById(int id){
        return sectionRepository.findById(id);
    }

    public Section findByName(String name){ return sectionRepository.findByName(name);}

}
