package com.jankruk.panelBudo.controller;

import com.jankruk.panelBudo.database.IEmployeeDAO;
import com.jankruk.panelBudo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
    @Autowired
    IEmployeeDAO employeeDAO;
@GetMapping(path = "/main")
    public String main(){
    return "main";
}
}
