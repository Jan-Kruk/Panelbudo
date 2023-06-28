package com.jankruk.panelBudo.database.memory;

import com.jankruk.panelBudo.database.IEmployeeDAO;

import com.jankruk.panelBudo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


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
    @Override
    public List<Employee> findAll(){
        TypedQuery<Employee> typedQuery = entityManager.createQuery("From Employee",Employee.class);
        return typedQuery.getResultList();
    }

}
