package com.example.Chocolate.Factory.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Data
    public class Product extends BaseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;

        String name;
       String ingredients;
        double price;
        int quantityAvailable;


}
