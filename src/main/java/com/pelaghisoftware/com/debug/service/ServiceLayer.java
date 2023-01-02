package com.pelaghisoftware.com.debug.service;

import com.pelaghisoftware.com.debug.dao.Dao;
import com.pelaghisoftware.com.debug.response.Thing;
import com.pelaghisoftware.com.debug.service.builder.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceLayer {
    @Autowired
    private Dao dao;

    @Autowired
    private Builder builder;

    public Thing getThing() {
        return builder.buildThing(dao.getThing());
    }
}
