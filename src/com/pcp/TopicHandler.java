package com.pcp;

import com.pcp.exceptions.TopicNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class TopicHandler<T> {

    private Map<String, QueueHandler<T>> queueMapping;

    public TopicHandler() {
        this.queueMapping = new HashMap<>();
    }

    public void addTopic(String topicName) {
        QueueHandler<T> queueHandlers = queueMapping.getOrDefault(topicName, new QueueHandler<>());
        queueMapping.put(topicName, queueHandlers);
    }

    public void publish(String topic, T message) {
        if (queueMapping.get(topic) == null)
            throw new TopicNotFoundException("Topic not found with name " + topic);
        queueMapping.get(topic).addIntoQueue(message);
    }

    public T consume(String topic) {
        if (queueMapping.get(topic) == null)
            throw new TopicNotFoundException("Topic not found with name " + topic);
        return queueMapping.get(topic).consumeFromQueue();
    }

}
