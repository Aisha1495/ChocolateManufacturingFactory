package com.example.Chocolate.Factory.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class Inventory extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     Long productId;
     int quantityAvailable;

    @ManyToOne
    @JoinColumn(name = "Id",referencedColumnName = "id")
    Product product;

}
