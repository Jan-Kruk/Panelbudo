package com.jankruk.panelBudo.database.memory;

import com.jankruk.panelBudo.database.ISIteDAO;

import com.jankruk.panelBudo.entity.Site;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class SiteDAO implements ISIteDAO {

    private EntityManager entityManager;
    @Autowired
    public SiteDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Site> findAll() {
        TypedQuery<Site> theQuery = entityManager.createQuery("From Site",Site.class);
        return theQuery.getResultList();
    }
}
