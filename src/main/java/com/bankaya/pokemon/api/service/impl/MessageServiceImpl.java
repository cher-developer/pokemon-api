package com.bankaya.pokemon.api.service.impl;

import com.bankaya.pokemon.api.model.entity.MessageEntity;
import com.bankaya.pokemon.api.model.entity.repository.MessageRepository;
import com.bankaya.pokemon.api.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public List<MessageEntity> findAllMessages() {
        return (List<MessageEntity>) messageRepository.findAll();
    }

    @Override
    public Optional<MessageEntity> findMessageById(Long id) {
        return Optional.empty();
    }

    @Override
    public MessageEntity saveMessage(MessageEntity message) {

        return messageRepository.save(message);
    }
}
