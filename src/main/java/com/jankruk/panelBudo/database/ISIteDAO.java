package com.jankruk.panelBudo.database;

import com.jankruk.panelBudo.entity.Site;

import java.util.List;

public interface ISIteDAO {
    List<Site> findAll();
}
