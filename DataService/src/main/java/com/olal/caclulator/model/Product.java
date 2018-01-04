import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "products")
public class Product {
    private Integer id;
    private String name;
    private Double proteins;
    private Double fats;
    private Double carbohydrates;
    private Double calories;

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    @Column(nullable = false)
    @NotNull
    @Size(max = 100)
    public String getName() {
        return name;
    }

    @Column(nullable = false)
    @NotNull
    public Double getProteins() {
        return proteins;
    }

    @Column(nullable = false)
    @NotNull
    public Double getFats() {
        return fats;
    }

    @Column(nullable = false)
    @NotNull
    public Double getCarbohydrates() {
        return carbohydrates;
    }

    @Column(nullable = false)
    @NotNull
    public Double getCalories() {
        return calories;
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
}
