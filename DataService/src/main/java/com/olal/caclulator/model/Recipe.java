package com.olal.caclulator.model;

import org.postgresql.util.PGInterval;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "recipes")
public class Recipe {
    private Integer id;
    private String name;
    private boolean isDefault;
    private String description;
    private Date creationDate;
    private PGInterval duration;

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    @Column(nullable = false)

    public String getName() {
        return name;
    }

    @Column(name = "is_default", nullable = false)

    public boolean isDefault() {
        return isDefault;
    }

    @Column(nullable = false)

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
}
