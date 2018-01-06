package com.olal.caclulator.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "recipes_categories")
public class RecipeCategory implements Serializable {
    private Integer id;
    private String title;
    private String description;
    private Set<Recipe> recipes;

    public RecipeCategory(){

    }

    public RecipeCategory(String title, String description){
        this.title = title;
        this.description = description;
    }

    public RecipeCategory(String title, String description, Set<Recipe> recipes){
        this.title = title;
        this.description = description;
        this.recipes = recipes;
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

    @Column(nullable = false, length = 100)
    public String getDescription() {
        return description;
    }

    @OneToMany(mappedBy = "recipes")
    public Set<Recipe> getRecipes() {
        return recipes;
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

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}
