package com.olal.caclulator.model;

import org.postgresql.util.PGInterval;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "recipes")
public class Recipe implements Serializable {
    private Integer id;
    private String name;
    private boolean isDefault;
    private String description;
    private Date creationDate;
    private PGInterval duration;
    private Set<User> belongToUsers;
    private RecipeCategory category;
    private Set<RecipeProduct> recipeProducts;

    public Recipe() {
    }

    public Recipe(String name, boolean isDefault, String description, Date creationDate, PGInterval duration, RecipeCategory category) {
        this.name = name;
        this.isDefault = isDefault;
        this.description = description;
        this.creationDate = creationDate;
        this.duration = duration;
        this.category = category;
    }

    public Recipe(String name, boolean isDefault, String description, Date creationDate, PGInterval duration, Set<User> belongToUsers, RecipeCategory category) {
        this.name = name;
        this.isDefault = isDefault;
        this.description = description;
        this.creationDate = creationDate;
        this.duration = duration;
        this.belongToUsers = belongToUsers;
        this.category = category;
    }

    public Recipe(String name, boolean isDefault, String description, Date creationDate, PGInterval duration, RecipeCategory category, Set<RecipeProduct> recipeProducts) {
        this.name = name;
        this.isDefault = isDefault;
        this.description = description;
        this.creationDate = creationDate;
        this.duration = duration;
        this.category = category;
        this.recipeProducts = recipeProducts;
    }

    public Recipe(String name, boolean isDefault, String description, Date creationDate, PGInterval duration, Set<User> belongToUsers, RecipeCategory category, Set<RecipeProduct> recipeProducts) {
        this.name = name;
        this.isDefault = isDefault;
        this.description = description;
        this.creationDate = creationDate;
        this.duration = duration;
        this.belongToUsers = belongToUsers;
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

    @Column(name = "is_default", nullable = false)
    public boolean isDefault() {
        return isDefault;
    }

    @Column(nullable = false, length = 1000)
    public String getDescription() {
        return description;
    }

    @Column(name = "creation_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreationDate() {
        return creationDate;
    }

    @Column(nullable = false)
    public PGInterval getDuration() {
        return duration;
    }

    @ManyToOne
    @JoinColumn(name = "category_id")
    public RecipeCategory getCategory() {
        return category;
    }

    @ManyToMany(mappedBy = "users")
    public Set<User> getBelongToUsers() {
        return belongToUsers;
    }

    @OneToMany(mappedBy = "pk.recipe")
    public Set<RecipeProduct> getRecipeProducts() {
        return recipeProducts;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setDuration(PGInterval duration) {
        this.duration = duration;
    }

    public void setBelongToUsers(Set<User> belongToUsers) {
        this.belongToUsers = belongToUsers;
    }

    public void setCategory(RecipeCategory category) {
        this.category = category;
    }

    public void setRecipeProducts(Set<RecipeProduct> recipeProducts) {
        this.recipeProducts = recipeProducts;
    }
}
