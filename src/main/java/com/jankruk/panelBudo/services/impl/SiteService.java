package com.jankruk.panelBudo.services.impl;

import com.jankruk.panelBudo.database.ISIteDAO;
import com.jankruk.panelBudo.entity.Site;
import com.jankruk.panelBudo.services.ISiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SiteService implements ISiteService {



    private ISIteDAO siteDAO;
@Autowired
    public SiteService(ISIteDAO siteDAO) {
        this.siteDAO = siteDAO;
    }

    @Override
    public List<Site> findAllSitesNames() {
        return siteDAO.findAll();
    }
}

