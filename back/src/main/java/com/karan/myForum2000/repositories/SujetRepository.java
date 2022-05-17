package com.karan.myForum2000.repositories;

import com.karan.myForum2000.entities.Sujet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SujetRepository extends MongoRepository<Sujet, String> {
}
