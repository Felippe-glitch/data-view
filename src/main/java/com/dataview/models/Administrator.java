package com.dataview.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = Administrator.TABLE_NAME)
public class Administrator {

    public static final String TABLE_NAME = "Administrator";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adm_id", unique = true)
    private Long id;

    @Column(nullable = false, length = 60, unique = true)
    @NotBlank
    private String email;

    @Column(name = "adm_id", nullable = false)
    @NotBlank
    private String name;

    @JsonIgnore
    @Column(nullable = false)
    @Size(min = 8)
    private String password;

    public Administrator() {}

    public Administrator(Long id, String email, String name, String password) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}