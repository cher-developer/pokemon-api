package com.bankaya.pokemon.api.model.entity.repository;

import com.bankaya.pokemon.api.model.entity.MessageEntity;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<MessageEntity, Long> {
}
