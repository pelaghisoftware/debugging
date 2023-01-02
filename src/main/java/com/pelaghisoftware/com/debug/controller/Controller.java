package com.pelaghisoftware.com.debug.controller;

import com.pelaghisoftware.com.debug.response.Thing;
import com.pelaghisoftware.com.debug.response.HelloResponse;
import com.pelaghisoftware.com.debug.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api/v1")
public class Controller {
    @Autowired
    private ServiceLayer service;

    @GetMapping(value = "/hello", produces = "application/json")
    public HelloResponse getHello() {
        return new HelloResponse("Hello World");
    }

    @GetMapping(value = "/thing", produces = "application/json")
    public Thing getThing() {
        try {
            return service.getThing();
        }catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getLocalizedMessage(), e);
        }
    }
}
