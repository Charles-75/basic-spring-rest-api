package com.asi.model;

import javax.persistence.*;

@Entity
@Table(name = "sections")
public class Section {

    @Id
    @Column(name = "id_section")
    @GeneratedValue
    int id;

    @Column(name = "name")
    private String name;

    public Section() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
