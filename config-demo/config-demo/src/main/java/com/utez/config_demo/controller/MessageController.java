package com.utez.config_demo.controller;

import com.utez.config_demo.model.Message;
import com.utez.config_demo.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {

    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @GetMapping("/api/message")
    public Message getMessage() {
        return service.getEnvironmentMessage();
    }
}
