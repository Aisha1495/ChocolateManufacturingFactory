package com.example.Chocolate.Factory.ResponseOpjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetOrderResponse {
    Long id;
    Long productId;
    int quantity;
    String shippingDetails;
    String orderDate;

}
