package com.example.Chocolate.Factory.Service;

import com.example.Chocolate.Factory.Models.Orders;
import com.example.Chocolate.Factory.Models.Product;
import com.example.Chocolate.Factory.Repository.OrderRepository;
import com.example.Chocolate.Factory.ResponseOpjects.GetOrderResponse;
import com.example.Chocolate.Factory.ResponseOpjects.GetProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public void saveOrder(Orders orders) {
        orderRepository.save(orders);
    }

    public List<Orders> getOrder() {
        return orderRepository.findAll();
    }


    public GetOrderResponse getOrder(Long orderId) {
        Optional<Orders> optionalOrder =  orderRepository.findById(orderId);
        if(!optionalOrder.isEmpty())
        {
            Orders orders =  optionalOrder.get();
            GetOrderResponse orderResponse = new GetOrderResponse(orders.getId(),orders.getQuantity(),orders.getShippingDetails(),orders.getOrderDate());
            return orderResponse;

        }

        return null;

    }

//    public void deleteOrder(Long orderId) {
//        orderRepository.deleteById(orderId);
//    }

//
//    public void saveOrUpdate(Orders orders) {
//        orderRepository.save(orders);
//    }

//
//    public Orders updateOrder (Long id, Orders updateData){
//       Orders orders = orderRepository.findById(id).orElse(null);
//        if (orders != null) {
//            orders.setId(updateData.getId());
//            orders.setOrderDate(updateData.getOrderDate());
//            orders.setShippingDetails(updateData.getShippingDetails());
//            orders.setQuantity(updateData.getQuantity());
//            orders.setUpdatedDate(updateData.getUpdatedDate());
//
//
//
//            return orderRepository.save(orders);
//        }
//        return null;
//    }


}