package com.karan.myForum2000.services.impl;

import com.karan.myForum2000.entities.Message;
import com.karan.myForum2000.repositories.MessageRepository;
import com.karan.myForum2000.services.GenericServices;

import java.time.LocalDateTime;
import java.util.List;

public class MessageServiceImpl implements GenericServices<Message> {

    private final MessageRepository repository;

    public MessageServiceImpl(MessageRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Message> findAll() {
        return repository.findAll();
    }

    @Override
    public Message findById(String id) {
        return repository.findById(id).get();
    }

    @Override
    public Message create(Message entity) {
        entity.setCreatedDate(LocalDateTime.now());
        return repository.save(entity);
    }

    @Override
    public Message update(Message entity) {
        entity.setModifiedDate(LocalDateTime.now());
        return repository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
