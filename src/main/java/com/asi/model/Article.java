package com.asi.model;




import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "articles")
public class Article {

    @Id
    @Column(name = "id_article")
    @GeneratedValue
    int id;

    @Column(name = "author")
    private String author;

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private Date date;

    @JoinColumn(name = "section")
    @ManyToOne
    private Section section;

    @Column(name = "text")
    private String text;

    @Column(name = "status")
    private String status;

    public Article(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
