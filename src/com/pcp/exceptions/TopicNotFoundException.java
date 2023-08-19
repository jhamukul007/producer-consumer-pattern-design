package com.pcp.exceptions;

public class TopicNotFoundException extends RuntimeException {
    public TopicNotFoundException(String s) {
        super(s);
    }
}
