package com.dataview.models;

import com.dataview.enums.MaritalStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = User.TABLE_NAME)
public class User {

    public static final String TABLE_NAME = "users";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true)
    private Long id;

    @JsonIgnore
    @Column(name = "user_password", nullable = false)
    @Size(min = 8, max = 100)
    @NotBlank
    private String password;

    @Column(name = "username", nullable = false, length = 100)
    @Size(min = 3, max = 100)
    @NotBlank
    private String name;

    @Column(name = "user_rg", nullable = false, length = 15, unique = true)
    @Size(min = 7, max = 15)
    @NotBlank
    private String rg;

    @Column(name = "user_cpf", nullable = false, length = 11, unique = true)
    @Size(min = 11, max = 14) 
    @NotBlank
    private String cpf;

    @Column(name = "user_birth", nullable = false, length = 10)
    @Size(min = 8, max = 10)
    @NotBlank
    private String dataBirth;

    @Column(name = "user_marital_status", nullable = false)
    @NotNull
    private MaritalStatus maritalStatus;

    @Column(name = "user_number", nullable = false, length = 15, unique = true)
    @NotBlank
    private String number;

    @Column(name = "user_email", nullable = false, length = 60, unique = true)
    @Size(min = 20, max = 60)
    @NotBlank
    private String email;

    @Embedded
    @NotBlank
    private Address address;

    // Constructors

    public User() {
    }

    public User(String name, String password, String rg, String cpf, String dataBirth, MaritalStatus maritalStatus, String number,
            String email, Address adress) {
        this.name = name;
        this.password = password;
        this.rg = rg;
        this.cpf = cpf;
        this.dataBirth = dataBirth;
        this.maritalStatus = maritalStatus;
        this.number = number;
        this.email = email;
        this.address = adress;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataBirth() {
        return dataBirth;
    }

    public void setDataBirth(String dataBirth) {
        this.dataBirth = dataBirth;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAdress() {
        return address;
    }

    public void setAdress(Address adress) {
        this.address = adress;
    }
}