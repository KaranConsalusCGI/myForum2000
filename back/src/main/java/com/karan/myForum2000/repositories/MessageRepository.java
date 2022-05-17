package com.karan.myForum2000.repositories;

import com.karan.myForum2000.entities.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {
}
