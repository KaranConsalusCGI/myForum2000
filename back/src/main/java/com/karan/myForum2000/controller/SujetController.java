package com.karan.myForum2000.controller;

import com.karan.myForum2000.constants.EndpointConstant;
import com.karan.myForum2000.entities.Sujet;
import com.karan.myForum2000.services.impl.SujetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(EndpointConstant.API + EndpointConstant.SUJET)
public class SujetController {

    @Autowired
    private SujetServiceImpl service;

    @GetMapping
    public List<Sujet> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Sujet findById(@PathVariable String id) {
        return this.service.findById(id);
    }

    @PostMapping()
    public Sujet create(@RequestBody Sujet sujet) {
        return this.service.create(sujet);
    }

    @PutMapping()
    public Sujet update(@RequestBody Sujet sujet) {
        return this.service.update(sujet);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.service.deleteById(id);
    }
}
