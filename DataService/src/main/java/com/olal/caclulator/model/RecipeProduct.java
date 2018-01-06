package com.olal.caclulator.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "recipe_products")
@AssociationOverrides({@AssociationOverride(name = "pk.product", joinColumns = @JoinColumn(name = "product_id")),
@AssociationOverride(name = "pk.recipe", joinColumns = @JoinColumn(name = "recipe_id"))})
public class RecipeProduct implements Serializable{
    private RecipeProductId pk = new RecipeProductId();
    private Double percentage;

    public RecipeProduct() {
    }

    @EmbeddedId
    public RecipeProductId getPk() {
        return pk;
    }

    @Column(nullable = false)
    public Double getPercentage() {
        return percentage;
    }

    @Transient
    public Recipe getRecipe(){
        return getPk().getRecipe();
    }

    @Transient
    public Product getProduct(){
        return getPk().getProduct();
    }

    public void setPk(RecipeProductId pk) {
        this.pk = pk;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public void setRecipe(Recipe recipe){
        return getPk().setRecipe(recipe);
    }

    public void setProduct(Product product){
        return getPk().setProduct(product);
    }

}
