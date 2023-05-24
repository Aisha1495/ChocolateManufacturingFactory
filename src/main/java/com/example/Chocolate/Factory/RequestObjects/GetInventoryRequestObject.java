package com.example.Chocolate.Factory.RequestObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetInventoryRequestObject {

    Long id;
    Long productId;
    int quantityAvailable;
}
