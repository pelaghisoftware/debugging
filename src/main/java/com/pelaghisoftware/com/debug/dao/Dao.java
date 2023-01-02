package com.pelaghisoftware.com.debug.dao;

import com.pelaghisoftware.com.debug.response.Thing;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class Dao {
    public Optional<Thing> getThing() {
        return Optional.of(new Thing());
    }
}
