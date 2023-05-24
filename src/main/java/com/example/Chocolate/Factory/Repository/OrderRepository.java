package com.example.Chocolate.Factory.Repository;

import com.example.Chocolate.Factory.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

}
