package com.olal.caclulator.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product implements Serializable {
    private Integer id;
    private String name;
    private Double proteins;
    private Double fats;
    private Double carbohydrates;
    private Double calories;
    private ProductCategory category;
    private Set<RecipeProduct> recipeProducts;

    public Product() {
    }

    public Product(String name, Double proteins, Double fats, Double carbohydrates, Double calories, ProductCategory category) {
        this.name = name;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
        this.category = category;
    }

    public Product(String name, Double proteins, Double fats, Double carbohydrates, Double calories, ProductCategory category, Set<RecipeProduct> recipeProducts) {
        this.name = name;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
        this.category = category;
        this.recipeProducts = recipeProducts;
    }

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    @Column(nullable = false, length = 100)
    public String getName() {
        return name;
    }

    @Column(nullable = false)
    public Double getProteins() {
        return proteins;
    }

    @Column(nullable = false)
    public Double getFats() {
        return fats;
    }

    @Column(nullable = false)
    public Double getCarbohydrates() {
        return carbohydrates;
    }

    @Column(nullable = false)
    public Double getCalories() {
        return calories;
    }

    @ManyToOne
    @JoinColumn(name = "category_id")
    public ProductCategory getCategory() {
        return category;
    }

    @OneToMany(mappedBy = "pk.product")
    public Set<RecipeProduct> getRecipeProducts() {
        return recipeProducts;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProteins(Double proteins) {
        this.proteins = proteins;
    }

    public void setFats(Double fats) {
        this.fats = fats;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public void setRecipeProducts(Set<RecipeProduct> recipeProducts) {
        this.recipeProducts = recipeProducts;
    }
}
