package com.example.Chocolate.Factory.ResponseOpjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetProductResponse {

    String name;
    String[] ingredients;
    double price;
    int quantityAvailable;

    public GetProductResponse(String name, String ingredients, double price, int quantityAvailable) {
    }
}
