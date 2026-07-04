package com.ecommerce.payment;


import jakarta.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String orderData;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getOrderData() { return orderData; }
    public void setOrderData(String orderData) { this.orderData = orderData; }
}
