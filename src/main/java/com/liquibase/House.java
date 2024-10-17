package com.liquibase;

import jakarta.persistence.*;

import java.io.Serializable;

/**
 * @author Julius Krah
 */
@Entity
@Table(indexes = @Index(name = "myIndex", columnList = "owner"))
public class House implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue
    private Integer id;

    @Column
    private String owner;

    @Column
    private boolean fullyPaid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isFullyPaid() {
        return fullyPaid;
    }

    public void setFullyPaid(boolean fullyPaid) {
        this.fullyPaid = fullyPaid;
    }

}
