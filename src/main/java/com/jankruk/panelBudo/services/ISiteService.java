package com.jankruk.panelBudo.services;

import com.jankruk.panelBudo.entity.Site;

import java.util.List;

public interface ISiteService {
    List<Site> findAllSitesNames();
}
