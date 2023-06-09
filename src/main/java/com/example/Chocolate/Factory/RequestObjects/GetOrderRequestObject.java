package com.example.Chocolate.Factory.RequestObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetOrderRequestObject {
    Long id;

    int quantity;
    String shippingDetails;
    Date orderDate;

}
