package com.example.Chocolate.Factory.Repository;

import com.example.Chocolate.Factory.Models.Order;
import com.example.Chocolate.Factory.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
