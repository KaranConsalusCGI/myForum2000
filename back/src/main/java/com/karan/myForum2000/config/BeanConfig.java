package com.karan.myForum2000.config;

import com.karan.myForum2000.repositories.MessageRepository;
import com.karan.myForum2000.repositories.SujetRepository;
import com.karan.myForum2000.services.impl.MessageServiceImpl;
import com.karan.myForum2000.services.impl.SujetServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    MessageServiceImpl messageService(MessageRepository messageRepository) {
        return new MessageServiceImpl(messageRepository);
    }

    @Bean
    SujetServiceImpl sujetService(SujetRepository sujetRepository) {
        return new SujetServiceImpl(sujetRepository);
    }
}
