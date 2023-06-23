package com.jankruk.panelBudo;

import com.jankruk.panelBudo.database.IEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    @Autowired
    IEmployeeDAO employeeDAO;

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }


}

