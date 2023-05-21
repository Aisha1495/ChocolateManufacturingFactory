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
public class FactoryManager extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
   String name;
    String role;
    String accessLevel;

    // Constructor
    public FactoryManager(String name, String role, String accessLevel) {
        this.name = name;
        this.role = role;
        this.accessLevel = accessLevel;
    }

}
