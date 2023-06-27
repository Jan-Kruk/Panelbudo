package com.jankruk.panelBudo.controller;

import com.jankruk.panelBudo.database.IEmployeeDAO;
import com.jankruk.panelBudo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CommonController {
    @Autowired
    IEmployeeDAO employeeDAO;
@GetMapping(path = "/main")
    public String main(){
    return "main";
}
    @GetMapping(path = "/worker")
    public String worker(){
        return "worker";
    }
@GetMapping(path = "/persistWorker")
    public String addWorker(Model model){
    Employee employee = new Employee();
    model.addAttribute("employee",employee);
    System.out.println(employee);
    List<String> listRoles = Arrays.asList("Kierownik budowy","Pracownik budowlany","Inżynier budowy");
    model.addAttribute("listRoles",listRoles);
    return "worker";
}
}
