package com.jankruk.panelBudo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tools")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Tool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "name")
    private String name;
    @Column(name = "model")
    private String model;

    public Tool(int quantity, String name, String model) {
        this.quantity = quantity;
        this.name = name;
        this.model = model;
    }
}
