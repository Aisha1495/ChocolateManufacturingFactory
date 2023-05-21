package com.example.Chocolate.Factory.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

   Long productId;
  int quantity;
  String shippingDetails;
  Date orderDate;



    public Order() {

    }

    public Order(Long productId, int quantity, String shippingDetails) {
        this.productId = productId;
        this.quantity = quantity;
        this.shippingDetails = shippingDetails;
        this.orderDate = new Date();
    }
}
