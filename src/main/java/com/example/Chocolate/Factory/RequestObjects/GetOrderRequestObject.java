package com.example.Chocolate.Factory.RequestObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetOrderRequestObject {
    Long id;
    Long productId;
    int quantity;
    String shippingDetails;
    String orderDate;

}
