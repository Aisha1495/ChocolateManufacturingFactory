package com.example.Chocolate.Factory.Controller;

import com.example.Chocolate.Factory.Models.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {


    @PostMapping
    public Order placeOrder(@RequestBody Order order) {


        return order;
    }
}
