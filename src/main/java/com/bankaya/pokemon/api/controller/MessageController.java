package com.bankaya.pokemon.api.controller;

import com.bankaya.pokemon.api.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/all-message")
    public ResponseEntity<?> allMessage() {
        return ResponseEntity.ok().body(this.messageService.findAllMessages());
    }

}
