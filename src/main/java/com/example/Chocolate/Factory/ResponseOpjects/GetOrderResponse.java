package com.example.Chocolate.Factory.ResponseOpjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetOrderResponse {
    Long id;

    int quantity;
    String shippingDetails;
    Date orderDate;

}
