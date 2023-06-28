package com.jankruk.panelBudo.services;

import com.jankruk.panelBudo.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<String> getRolesList();
    void addNewWorker(Employee theEmployee);
    List<Employee> findAllEmployees();
}
