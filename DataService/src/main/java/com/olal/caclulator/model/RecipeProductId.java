package com.olal.caclulator.model;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class RecipeProductId implements Serializable{
    private Recipe recipe;
    private Product product;

    @ManyToOne
    public Recipe getRecipe() {
        return recipe;
    }

    @ManyToOne
    public Product getProduct() {
        return product;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecipeProductId that = (RecipeProductId) o;

        if (recipe != null ? !recipe.equals(that.recipe) : that.recipe != null) return false;
        if (product != null ? !product.equals(that.product) : that.product != null)
            return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (product != null ? product.hashCode() : 0);
        result = 31 * result + (recipe != null ? recipe.hashCode() : 0);
        return result;
    }
}
