package com.asi.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "author")
    private String author;

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private Date date;

    @JoinColumn(name = "section_id")
    @ManyToOne
    private Section section;

    @Column(name = "text")
    private String text;

    @Column(name = "status")
    private String status;

}
