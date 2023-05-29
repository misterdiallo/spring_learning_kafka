package com.misterdiallo.backend.producer.controller;

import com.misterdiallo.backend.producer.model.MessageRequest;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/produce/messages")
@RequiredArgsConstructor
@Data
public class MessageController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public void publish(
            @RequestBody MessageRequest request
    ) {
        kafkaTemplate.send(
                request.topic(),
                request.message()
        );
    }


}

