package com.olal.caclulator.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "products_categories")
public class ProductCategory implements Serializable {
    private Integer id;
    private String title;
    private String description;
    private Set<Product> products;

    public ProductCategory() {
    }

    public ProductCategory(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public ProductCategory(String title, String description, Set<Product> products) {
        this.title = title;
        this.description = description;
        this.products = products;
    }

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

    @OneToMany(mappedBy = "products")
    public Set<Product> getProducts() {
        return products;
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

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
