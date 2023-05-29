package com.misterdiallo.backend.producer.listeners;


import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.producer.Producer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafKaListeners {

    @KafkaListener(
            topics = "sample",
            groupId = "group1"
    )
    void listenerSample(String data) {
        System.out.println("Sample received: " + data + " 🎉");
    }


    @KafkaListener(
            topics = "chat",
            groupId = "group2"
    )
    void listenerChat(String data) {
        System.out.println("Chat received: " + data + " 💬");
    }



    interface Listener<K, V> {

        default void producerAdded(String id, Producer<K, V> producer) {
            System.out.println("➕➕➕ New producer: " + id );
        }

        default void producerRemove(String id, Producer<K, V> producer) {

            System.out.println("🗑 🗑 🗑 Delete producer: " + id );
        }

    }



}

