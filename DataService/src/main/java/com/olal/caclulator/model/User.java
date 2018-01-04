import org.hibernate.annotations.Type;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    private Integer id;
    private String email;
    private String lastName;
    private String firstName;
    private boolean isAdmin;
    private Date birthDate;
    private Date registrationDate;
    private String password;

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    @Column(unique = true, nullable = false)
    @NotNull
    @Size(max = 255)
    public String getEmail() {
        return email;
    }

    @Column(name = "last_name", nullable = false)
    @NotNull
    @Size(max = 50)
    public String getLastName() {
        return lastName;
    }

    @Column(name = "first_name", nullable = false)
    @NotNull
    @Size(max = 50)
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "is_admin", nullable = false)
    @NotNull
    public boolean isAdmin() {
        return isAdmin;
    }

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    public Date getBirthDate() {
        return birthDate;
    }

    @Column(name = "registration_date", nullable = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    public Date getRegistrationDate() {
        return registrationDate;
    }

    @Column(nullable = false)
    @NotNull
    @Size(max = 255)
    public String getPassword() {
        return password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
