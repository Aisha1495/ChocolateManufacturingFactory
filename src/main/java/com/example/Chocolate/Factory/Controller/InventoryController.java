package com.example.Chocolate.Factory.Controller;

import com.example.Chocolate.Factory.Models.Product;
import com.example.Chocolate.Factory.Repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    private final ProductRepository productRepository;

    @Autowired
    public InventoryController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getInventory() {

        List<Product> products = productRepository.findAll();
        return products;
    }

    //update ... Not explained !!!!!!
//    @PutMapping("/{productId}")
//    public Product updateQuantity(@PathVariable Long productId, @RequestParam int quantity) {
//        // Implement logic to update the quantity available of a chocolate product
//        // ...
//      //  return updatedProduct;
//   // }
}