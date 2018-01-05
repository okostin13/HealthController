package com.olal.caclulator.model;

import javax.persistence.*;

@Entity
@Table(name = "products_categories")
public class ProductCategory {
    private Integer id;
    private String title;
    private String description;

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    @Column(nullable = false, length = 100)
    public String getTitle() {
        return title;
    }

    @Column(nullable = false, length = 200)
    public String getDescription() {
        return description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
