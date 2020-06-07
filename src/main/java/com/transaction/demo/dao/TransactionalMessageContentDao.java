package com.transaction.demo.dao;

import com.transaction.demo.entity.TransactionalMessageContent;

import java.util.List;

public interface TransactionalMessageContentDao {

    void insert(TransactionalMessageContent record);

    List<TransactionalMessageContent> queryByMessageIds(String messageIds);

}
