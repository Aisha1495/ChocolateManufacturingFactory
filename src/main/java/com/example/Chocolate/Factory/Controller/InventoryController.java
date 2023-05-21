package com.example.Chocolate.Factory.Controller;

import com.example.Chocolate.Factory.Models.Product;
import com.example.Chocolate.Factory.Repository.ProductRepository;
import com.example.Chocolate.Factory.Service.ProductService;
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

    @Autowired
    ProductService productService;

    @RequestMapping("product/create")
    public void saveProduct () {
        createProduct();
    }

    public void createProduct() {

        Product product = new Product();
       product.setId(1225L);

       //
        productService.saveProduct(product);
    }


    @GetMapping
    public List<Product> getInventory() {

        List<Product> products = productRepository.findAll();
        return products;
    }

    //update ... Not explained !!!!!!


}