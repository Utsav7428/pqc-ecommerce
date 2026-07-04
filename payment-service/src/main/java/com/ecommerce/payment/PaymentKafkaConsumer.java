package com.ecommerce.payment;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentKafkaConsumer {

    private final PaymentRepository paymentRepository;

    public PaymentKafkaConsumer(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @KafkaListener(topics = "orders-topic", groupId = "payment-group")
    public void consumeOrder(String message) {
        Payment payment = new Payment();
        payment.setOrderData(message);
        paymentRepository.save(payment);
    }
}