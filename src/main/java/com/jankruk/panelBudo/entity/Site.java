package com.jankruk.panelBudo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "site")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Site {
    private int id;
    private String siteName;
    private String address;
    private String constructionManager;


}
