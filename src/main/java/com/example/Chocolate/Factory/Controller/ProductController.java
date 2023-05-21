package com.example.Chocolate.Factory.Controller;

import com.example.Chocolate.Factory.Models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    //create
    @PostMapping
    public Product createProduct(@RequestBody Product product) {

        return product;
    }


    //update
    @PutMapping("/{productId}")
    public Product updateProduct(@PathVariable Long productId, @RequestBody Product updatedProduct) {

        return updatedProduct;
    }


    //delete
    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Long productId) {

    }
}

