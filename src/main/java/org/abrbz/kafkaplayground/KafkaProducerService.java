package org.abrbz.kafkaplayground;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        String topic = "test-topic";
        kafkaTemplate.send(topic, message);
        System.out.println("Message sent to topic: " + topic + " : " + message);
    }


}
