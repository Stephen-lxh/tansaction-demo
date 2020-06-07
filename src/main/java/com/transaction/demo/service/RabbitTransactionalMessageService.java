package com.transaction.demo.service;

import com.transaction.demo.support.message.TxMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.Destination;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Slf4j
@Service
@RequiredArgsConstructor
public class RabbitTransactionalMessageService implements TransactionalMessageService {

    private final AmqpAdmin amqpAdmin;
    private final TransactionalMessageManagementService managementService;

    private static final ConcurrentMap<String, Boolean> QUEUE_ALREADY_DECLARE = new ConcurrentHashMap<>();

    @Override
    public void sendTransactionalMessage(Destination destination, TxMessage message) {



    }
}
