package com.jankruk.panelBudo.database.memory;

import com.jankruk.panelBudo.database.IEmployeeDAO;
import com.jankruk.panelBudo.database.ISIteDAO;
import com.jankruk.panelBudo.entity.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SiteDAO implements ISIteDAO {
    @Autowired
    IEmployeeDAO employeeDAO;
    private final List<Site> sites = new ArrayList<>();

    private int lastID=4;

//    public SiteDAO() {
//        sites.add(new Site("Agart","Krzemienica 37-112 324A Krzemienica",
//                employeeDAO.getEmployees().get(0).getNameAndSurname(),1));
//        sites.add(new Site("Agart","Krzemienica 37-112 324A Krzemienica",
//                employeeDAO.getEmployees().get(0).getNameAndSurname(),2));
//        sites.add(new Site("Agart","Krzemienica 37-112 324A Krzemienica",
//                employeeDAO.getEmployees().get(1).getNameAndSurname(),3));
//        sites.add(new Site("Agart","Krzemienica 37-112 324A Krzemienica",
//                employeeDAO.getEmployees().get(1).getNameAndSurname(),4));
//    }
}
