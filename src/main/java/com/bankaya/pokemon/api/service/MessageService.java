package com.bankaya.pokemon.api.service;

import com.bankaya.pokemon.api.model.entity.MessageEntity;

import java.util.List;
import java.util.Optional;

public interface MessageService {

    List<MessageEntity> findAllMessages();

    Optional<MessageEntity> findMessageById(Long id);

    MessageEntity saveMessage(MessageEntity message);
}
