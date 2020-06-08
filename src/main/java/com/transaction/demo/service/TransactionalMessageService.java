package com.transaction.demo.service;

import com.transaction.demo.support.binding.Destination;
import com.transaction.demo.support.message.TxMessage;


public interface TransactionalMessageService {

    void sendTransactionalMessage(Destination destination, TxMessage message);

}
