package com.misterdiallo.backend.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic sampleTopic() {
        return TopicBuilder
                .name("sample")
                .build();
    }

    @Bean
    public NewTopic chatTopic() {
        return TopicBuilder
                .name("chat")
                .build();
    }
}
