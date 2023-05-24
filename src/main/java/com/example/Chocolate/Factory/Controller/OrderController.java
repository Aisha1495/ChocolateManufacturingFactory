package com.example.Chocolate.Factory.Controller;

import com.example.Chocolate.Factory.Models.Orders;
import com.example.Chocolate.Factory.Models.Product;
import com.example.Chocolate.Factory.RequestObjects.GetOrderRequestObject;
import com.example.Chocolate.Factory.ResponseOpjects.GetOrderResponse;
import com.example.Chocolate.Factory.ResponseOpjects.GetProductResponse;
import com.example.Chocolate.Factory.Service.OrderService;
import com.example.Chocolate.Factory.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;


    //create
    @RequestMapping("order/create")
    public void saveOrder(@RequestBody GetOrderRequestObject OrderRequestObject) {
        Object orderRequestObject = new Object();
        createOrder(orderRequestObject);
    }


    //get
    @RequestMapping("orders/get")
    public List<Orders> getOrder() {
        return orderService.getOrder();
    }


//    //Path Variable
//    @RequestMapping("orders/get/{orderId}")
//    public GetOrderResponse createOrder (@PathVariable Long orderId) {
//        return orderService.getProductById(orderId);
//    }


//
//    //update
//    @PutMapping("/{orderId}")
//    public Orders updateOrder(@PathVariable Long orderId) {
//
//        return updateOrder;
//    }


//    //delete
//    @DeleteMapping("orders/{orderId}")
//    public void deleteOrder(@PathVariable Long orderId) {
//        try {
//           orderService.deleteOrder(orderId);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
//
//    //update
//    @PutMapping("orders/put/{id}")
//    public ResponseEntity<Orders> updateOrder(@PathVariable Long id, @RequestBody Orders updateData) {
//        Orders orders = orderService.updateOrder(id, updateData);
//        if (order != null) {
//            return ResponseEntity.ok(order);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }


    private void createOrder(Object orderRequestObject) {
        Orders order = new Orders();
        order.setId(1234L);
        order.setCreatedDate(new Date(2023,12,05));
        order.setIsActive(true);
        order.setUpdatedDate(new Date(2023,12,05));
        order.setOrderDate(new Date(2023,12,05));
        order.setQuantity(120);
        order.setShippingDetails("completed");


        orderService.saveOrder(order);
    }
}
