package com.utez.config_demo.repository;


import com.utez.config_demo.model.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;


@Repository
public class MessageRepository {

    @Value("${app.environment:Default}")
    private String environment;

    @Value("${app.message:Sin mensaje definido}")
    private String message;

    public Message getMessage() {
        return new Message(environment, message);
    }
}
