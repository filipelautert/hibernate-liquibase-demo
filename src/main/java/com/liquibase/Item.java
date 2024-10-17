package com.liquibase;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

/**
 * @author Julius Krah
 */
@Entity
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GenericGenerator(
            name = "user_seq_generator",
            strategy = "enhanced-sequence",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "user_seq"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "100"),
                    @org.hibernate.annotations.Parameter(name = "optimizer", value = "pooled-lo")
            })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_generator")
    private Long id;

    @Column(unique = true)
    private String name;
    @ManyToOne
    private House house;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
}
