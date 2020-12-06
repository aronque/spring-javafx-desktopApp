package com.example.model.entities;

import javax.persistence.Entity;

@Entity
public class OrderItem {
    private Integer quantity;
    private Product product;
}
