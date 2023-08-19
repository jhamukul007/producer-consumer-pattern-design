package com.pcp.exceptions;

import com.pcp.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ConsumerMetaData<T>  {
    private String consumerId;
    private List<Consumer> topics;

    public ConsumerMetaData() {
        this.consumerId = UUID.randomUUID().toString();
        this.topics = new ArrayList<>();
    }

    public void addTopic(String topicName){
        topics.add(topicName);
    }

    public void removeTopic(String topicName){
        topics.remove(topicName);
    }

    public String getConsumerId() {
        return consumerId;
    }

    @Override
    public T consume() {

    }
}
