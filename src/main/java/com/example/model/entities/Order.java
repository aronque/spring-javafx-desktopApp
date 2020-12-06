package com.example.model.entities;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    List<OrderItem> orderItemList = new ArrayList<>();

    private Client client;
    private Date date;
}
