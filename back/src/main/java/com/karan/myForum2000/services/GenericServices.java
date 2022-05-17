package com.karan.myForum2000.services;

import java.util.List;

public interface GenericServices<T> {
    public List<T> findAll();
    public T findById(String id);
    public T create(T entity);
    public T update(T entity);
    public void deleteById(String id);
}
