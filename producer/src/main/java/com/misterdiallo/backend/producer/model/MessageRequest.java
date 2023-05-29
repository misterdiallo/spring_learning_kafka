package com.misterdiallo.backend.producer.model;

public record MessageRequest(
        String message,
        String topic
) {
}
