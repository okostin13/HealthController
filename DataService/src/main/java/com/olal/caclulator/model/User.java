package com.olal.caclulator.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "users")
public class User implements Serializable {
    private Integer id;
    private String email;
    private String lastName;
    private String firstName;
    private boolean isAdmin;
    private Date birthDate;
    private Date registrationDate;
    private String password;
    private Set<Recipe> recipes;

    public User(){

    }

    public User(String email, String lastName, String firstName, boolean isAdmin, Date birthDate, Date registrationDate, String password) {
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.isAdmin = isAdmin;
        this.birthDate = birthDate;
        this.registrationDate = registrationDate;
        this.password = password;
    }

    public User(String email, String lastName, String firstName, boolean isAdmin, Date birthDate, Date registrationDate, String password, Set<Recipe> recipes) {
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.isAdmin = isAdmin;
        this.birthDate = birthDate;
        this.registrationDate = registrationDate;
        this.password = password;
        this.recipes = recipes;
    }

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    @Column(unique = true, nullable = false)
    public String getEmail() {
        return email;
    }

    @Column(name = "last_name", nullable = false, length = 50)
    public String getLastName() {
        return lastName;
    }

    @Column(name = "first_name", nullable = false, length = 50)
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "is_admin", nullable = false)
    public boolean isAdmin() {
        return isAdmin;
    }

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    public Date getBirthDate() {
        return birthDate;
    }

    @Column(name = "registration_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getRegistrationDate() {
        return registrationDate;
    }

    @Column(nullable = false)
    public String getPassword() {
        return password;
    }

    @ManyToMany
    @JoinTable(name = "user_recipes", joinColumns = @JoinColumn(name = "user_id", nullable = false, updatable = false),
    inverseJoinColumns = @JoinColumn(name = "recipe_id", nullable = false, updatable = false))
    public Set<Recipe> getRecipes() {
        return recipes;
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

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}
