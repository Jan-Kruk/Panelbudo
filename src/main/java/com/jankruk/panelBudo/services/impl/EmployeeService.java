package com.jankruk.panelBudo.services.impl;

import com.jankruk.panelBudo.database.IEmployeeDAO;
import com.jankruk.panelBudo.entity.Employee;
import com.jankruk.panelBudo.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class EmployeeService implements IEmployeeService {

    private IEmployeeDAO employeeDAO;
    @Autowired
    public EmployeeService(IEmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<String> getRolesList() {
        return  Arrays.asList("Kierownik budowy","Pracownik budowlany","Inżynier budowy");
    }

    @Override
    public void addNewWorker(Employee theEmployee) {
        employeeDAO.save(theEmployee);
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeDAO.findAll();
    }

}
