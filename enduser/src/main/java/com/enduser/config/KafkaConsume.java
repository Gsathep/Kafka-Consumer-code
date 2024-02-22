package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class KafkaConsume {

    @KafkaListener(topics = constant.LOCATION_TOPIC_NAME, groupId = constant.GROUP_ID)
    public void updatedLocation(String value) {
        System.out.println(value);
    }
}
