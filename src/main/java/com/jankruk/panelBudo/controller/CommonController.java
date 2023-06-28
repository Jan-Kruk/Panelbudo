package com.jankruk.panelBudo.controller;

import com.jankruk.panelBudo.database.IEmployeeDAO;
import com.jankruk.panelBudo.entity.Employee;
import com.jankruk.panelBudo.services.IEmployeeService;
import com.jankruk.panelBudo.services.ISiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CommonController {

    private IEmployeeService employeeService;

    private ISiteService siteService;
    @Autowired
    public CommonController(IEmployeeService employeeService, ISiteService siteService) {
        this.employeeService = employeeService;
        this.siteService = siteService;
    }

    @GetMapping(path = "/main")
    public String main(){
    return "main";
}
    @GetMapping(path = "/worker")
    public String worker(Model model){
        model.addAttribute("listRoles",employeeService.getRolesList());
//        model.addAttribute("listSites",siteService.findAllSitesNames());
        model.addAttribute("employees",employeeService.findAllEmployees());
        return "worker";
    }
    @GetMapping(path = "/persistWorker")
    public String addWorker(@RequestParam String name,
                            @RequestParam String surname,
                            @RequestParam String role,
                            @RequestParam(required = false) String currentSite){
    employeeService.addNewWorker(new Employee(name,surname,role,currentSite));
    return "redirect:/worker";
}
}
