package com.karan.myForum2000.controller;

import com.karan.myForum2000.constants.EndpointConstant;
import com.karan.myForum2000.entities.Message;
import com.karan.myForum2000.services.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(EndpointConstant.API + EndpointConstant.MESSAGE)
public class MessageController {

    @Autowired
    private MessageServiceImpl messageService;

    @GetMapping
    public List<Message> findAll() {
        return this.messageService.findAll();
    }

    @GetMapping("{id}")
    public Message findById(@PathVariable String id) {
        return this.messageService.findById(id);
    }

    @PostMapping()
    public Message create(@RequestBody Message message) {
        return this.messageService.create(message);
    }

    @PutMapping()
    public Message update(@RequestBody Message message) {
        return this.messageService.update(message);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.messageService.deleteById(id);
    }

}
