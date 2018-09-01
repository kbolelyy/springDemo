package com.example.demo.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "Employee")
public class Employee {


    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String fitrstName;
    @Column(name = "second_name")
    private String secondName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFitrstName() {
        return fitrstName;
    }

    public void setFitrstName(String fitrstName) {
        this.fitrstName = fitrstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
