package com.example.Chocolate.Factory.Controller;

import com.example.Chocolate.Factory.Models.Product;
import com.example.Chocolate.Factory.RequestObjects.GetProductRequestObject;
import com.example.Chocolate.Factory.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ListIterator;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;


    //create
    @RequestMapping("employee/create")
    public void saveProduct(@RequestBody GetProductRequestObject ProductRequestObject) {
        Object productRequestObject = new Object();
        createProduct(productRequestObject);
    }

    private void createProduct(Object productRequestObject) {
        Product product = new Product();
        product.setId(1223L);
        product.setName("Choco");
        product.setIngredients("Milk,cacao,sugar");
        product.setPrice(0.600);
        product.setQuantityAvailable(1223);

        ProductService.saveProduct(product);
    }

    //get
    @RequestMapping("product/get")
    public List<Product> getProduct() {
        return ProductService.getProduct();
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

    }

