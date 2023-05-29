package com.misterdiallo.backend.producer.listeners;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public interface ProducerListener<K, V> {

    void onSuccess(ProducerRecord<K, V> producerRecord, RecordMetadata recordMetadata);

    void onError(ProducerRecord<K, V> producerRecord, RecordMetadata recordMetadata,
                 Exception exception);

}