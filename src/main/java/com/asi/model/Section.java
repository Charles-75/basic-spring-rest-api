package com.asi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "sections")
@EqualsAndHashCode(exclude = { "articles"})
@ToString(exclude = { "articles"})
public class Section {

    @Id
    int id;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "section")
    private List<Article> articles;

    @Override
    public String toString() {
        return name;
    }


}
