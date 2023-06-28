package com.jankruk.panelBudo.database;


import com.jankruk.panelBudo.entity.Employee;

import java.util.List;

public interface IEmployeeDAO {
    void save(Employee theEmployee);
    List<Employee> findAll();
}
