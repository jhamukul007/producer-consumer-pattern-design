package com.pcp;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueHandler<T> {
    private final BlockingQueue<T> queue;

    public QueueHandler() {
        this.queue = new ArrayBlockingQueue<>(10000);
    }

    public void addIntoQueue(T t) {
        queue.offer(t);
    }

    public T consumeFromQueue() {
        return queue.poll();
    }

}
