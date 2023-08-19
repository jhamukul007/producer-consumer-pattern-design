package com.pcp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProducerConfig {
    private final Map<String, Producer> producers;

    public ProducerConfig() {
        this.producers = new HashMap<>();
    }

    public void addProducer(Producer producer){
        this.addProducer();
    }

    <T> Producer<T> getProducer(String id){
        return producers.
    }
}
