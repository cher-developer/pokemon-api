package com.bankaya.pokemon.api.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "messages_entity")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ip_oringin")
    private String ipOrigin;

    @Column(name = "method_name")
    private String methodName;

    @Column(name = "REGIST_DATE", updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date registDate;

    @Column(name = "start_time")
    private Long startTime;

    @Column(name = "end_time")
    private Long endTime;


}
