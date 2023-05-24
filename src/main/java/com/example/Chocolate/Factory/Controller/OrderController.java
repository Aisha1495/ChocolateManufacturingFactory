package com.example.Chocolate.Factory.Controller;

import com.example.Chocolate.Factory.Models.Order;
import com.example.Chocolate.Factory.Models.Product;
import com.example.Chocolate.Factory.RequestObjects.GetOrderRequestObject;
import com.example.Chocolate.Factory.RequestObjects.GetProductRequestObject;
import com.example.Chocolate.Factory.Service.OrderService;
import com.example.Chocolate.Factory.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {


    @PostMapping
    public Order placeOrder(@RequestBody Order order) {


        return order;
    }

    //create
    @RequestMapping("order/create")
    public void saveOrder(@RequestBody GetOrderRequestObject OrderRequestObject) {
        Object orderRequestObject = new Object();
        createOrder(orderRequestObject);
    }


    //get
    @RequestMapping("order/get")
    public List<Order> getOrder() {
        return OrderService.getOrder();
    }



    //update
    @PutMapping("/{productId}")
    public Product updateProduct(@PathVariable Long productId, @RequestBody Product updatedProduct) {

        return updatedProduct;
    }


    //delete
    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Long productId) {
        try {
            ProductService.deleteProduct(productId);
        }catch (Exception e){
            e.printStackTrace();
        }

    }



    private void createOrder(Object orderRequestObject) {
        Order order = new Order();
        order.setId(1224L);
        order.setOrderDate("02/05/2023");
        order.setQuantity(120);
        order.setShippingDetails("completed");
        order.setProductId(1234L);

        OrderService.saveOrder(order);
    }
}
