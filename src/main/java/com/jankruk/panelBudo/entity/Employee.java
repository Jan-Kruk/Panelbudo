package com.jankruk.panelBudo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surName;
    @Column(name = "role")
    private String role;
    @Column(name = "salary")
    private int salary;
    @Column(name = "current_site")
    private String currentSite;

    public Employee(String name, String surName, String role, int salary, String currentSite) {
        this.name = name;
        this.surName = surName;
        this.role = role;
        this.salary = salary;
        this.currentSite = currentSite;
    }
}
