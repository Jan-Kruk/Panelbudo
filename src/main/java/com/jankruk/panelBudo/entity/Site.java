package com.jankruk.panelBudo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "site")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "siteName")
    private String siteName;
    @Column(name = "address")
    private String address;
    @Column(name = "constructionManager")
    private String constructionManager;

    public Site(String siteName, String address, String constructionManager) {
        this.siteName = siteName;
        this.address = address;
        this.constructionManager = constructionManager;
    }
}
