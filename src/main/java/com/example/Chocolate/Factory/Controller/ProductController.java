package com.example.Chocolate.Factory.Controller;

import com.example.Chocolate.Factory.Models.Product;
import com.example.Chocolate.Factory.RequestObjects.GetProductRequestObject;
import com.example.Chocolate.Factory.ResponseOpjects.GetProductResponse;
import com.example.Chocolate.Factory.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ListIterator;


///{ "name": "Dark Chocolate Bar", "ingredients": "cocoa-sugar-butter", "price": 2.99, "quantity":
//100 }
@RestController
//@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;


    //create
    @RequestMapping("product/create")
    public void saveProduct(@RequestBody GetProductRequestObject ProductRequestObject) {
        Object productRequestObject = new Object();
        createProduct(productRequestObject);
    }


    //get
    @RequestMapping("product/get")
    public List<Product> getProduct() {
        return productService.getProduct();
    }

    //Path Variable
    @RequestMapping("product/get/{productId}")
    public GetProductResponse createProduct (@PathVariable Long productId) {
        return productService.getProductById(productId);
    }



//    //delete
//    @DeleteMapping("product/{productId}")
//    public void deleteProduct(@PathVariable Long productId) {
//        try {
//            productService.deleteProduct(productId);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }


//    //update
//    @PutMapping("product/put/{id}")
//    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product updateData) {
//        Product product = productService.updateProduct(id, updateData);
//        if (product != null) {
//            return ResponseEntity.ok(product);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

    private void createProduct(Object productRequestObject) {
        Product product = new Product();
        product.setName("Dark Chocolate Bar");
        product.setIngredients("cocoa-sugar-butter");
        product.setPrice(2.99);
        product.setQuantityAvailable(100);

        productService.saveProduct(product);
    }
    }

