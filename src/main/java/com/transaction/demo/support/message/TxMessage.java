package com.transaction.demo.support.message;

// 事务消息
public interface TxMessage {

    String businessModule();

    String businessKey();

    String content();

}
