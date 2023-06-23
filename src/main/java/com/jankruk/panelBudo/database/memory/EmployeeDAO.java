package com.jankruk.panelBudo.database.memory;

import com.jankruk.panelBudo.database.IEmployeeDAO;

import com.jankruk.panelBudo.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class EmployeeDAO implements IEmployeeDAO {
    private EntityManager entityManager;
    @Autowired
    public EmployeeDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {
        entityManager.persist(theEmployee);
    }
}
