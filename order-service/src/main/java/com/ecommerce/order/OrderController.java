package com.ecommerce.order;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public OrderController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody String orderJson) {
        kafkaTemplate.send("orders-topic", orderJson);
        return ResponseEntity.ok("Order received and dispatched to secure pipeline.");
    }
}
