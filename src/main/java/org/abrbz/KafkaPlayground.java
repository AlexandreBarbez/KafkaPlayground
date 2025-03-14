package org.abrbz;

import org.abrbz.kafkaplayground.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class KafkaPlayground {

    public static void main(String[] args) {
        SpringApplication.run(KafkaPlayground.class, args);
    }
}