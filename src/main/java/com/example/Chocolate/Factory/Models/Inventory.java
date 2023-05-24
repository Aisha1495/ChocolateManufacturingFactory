package com.example.Chocolate.Factory.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

}
