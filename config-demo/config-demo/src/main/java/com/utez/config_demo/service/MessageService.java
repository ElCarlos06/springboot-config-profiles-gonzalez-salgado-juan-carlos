package com.utez.config_demo.service;

import com.utez.config_demo.model.Message;
import com.utez.config_demo.repository.MessageRepository;
import org.springframework.stereotype.Service;


@Service
public class MessageService {
    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Message getEnvironmentMessage() {
        return repository.getMessage();
    }
}