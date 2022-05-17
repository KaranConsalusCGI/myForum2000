package com.karan.myForum2000.services.impl;

import com.karan.myForum2000.entities.Sujet;
import com.karan.myForum2000.repositories.SujetRepository;
import com.karan.myForum2000.services.GenericServices;

import java.time.LocalDateTime;
import java.util.List;

public class SujetServiceImpl implements GenericServices<Sujet> {

    private final SujetRepository repository;

    public SujetServiceImpl(SujetRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Sujet> findAll() {
        return repository.findAll();
    }

    @Override
    public Sujet findById(String id) {
        return repository.findById(id).get();
    }

    @Override
    public Sujet create(Sujet entity) {
        entity.setCreatedDate(LocalDateTime.now());
        return repository.save(entity);
    }

    @Override
    public Sujet update(Sujet entity) {
        entity.setModifiedDate(LocalDateTime.now());
        return repository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
