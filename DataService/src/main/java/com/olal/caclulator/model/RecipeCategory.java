import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "recipes_categories")
public class RecipeCategory {
    private Integer id;
    private String title;
    private String description;

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    @Column(nullable = false)
    @NotNull
    @Size(max = 100)
    public String getTitle() {
        return title;
    }

    @Column(nullable = false)
    @NotNull
    @Size(max = 100)
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
