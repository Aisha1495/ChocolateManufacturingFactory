package com.example.Chocolate.Factory.Service;

import com.example.Chocolate.Factory.Models.Order;
import com.example.Chocolate.Factory.Models.Product;
import com.example.Chocolate.Factory.Repository.OrderRepository;
import com.example.Chocolate.Factory.ResponseOpjects.GetOrderResponse;
import com.example.Chocolate.Factory.ResponseOpjects.GetProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    static
    OrderRepository orderRepository;

    public static void saveOrder(Order order) {
        orderRepository.save(order);
    }

    public static List<Order> getOrder() {
        return orderRepository.findAll();
    }


    public GetOrderResponse getOrderByUserName(Long orderId) {
        Optional<Order> optionalOrder =  orderRepository.findById(orderId);
        if(!optionalOrder.isEmpty())
        {
            Order order =  optionalOrder.get();
            GetOrderResponse orderResponse = new GetOrderResponse(order.getId(),order.getProductId(),order.getQuantity(),order.getShippingDetails(),order.getOrderDate());
            return orderResponse;

        }

        return null;

    }

    public static void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }




}
