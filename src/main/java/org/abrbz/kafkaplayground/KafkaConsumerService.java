package org.abrbz.kafkaplayground;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "test-topic")
    public void consume(String message) {
        System.out.println("message lu : " + message);
    }

}
