package com.transaction.demo.service;

import com.transaction.demo.support.message.TxMessage;

import javax.print.attribute.standard.Destination;

public interface TransactionalMessageService {

    void sendTransactionalMessage(Destination destination, TxMessage message);

}
