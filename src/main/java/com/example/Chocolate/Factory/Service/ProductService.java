package com.example.Chocolate.Factory.Service;

import com.example.Chocolate.Factory.Models.Product;
import com.example.Chocolate.Factory.Repository.ProductRepository;
import com.example.Chocolate.Factory.ResponseOpjects.GetProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    @Autowired
    static
    ProductRepository productRepository;


    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public static List<Product> getProduct() {
        return productRepository.findAll();
    }


    public GetProductResponse getEmployeeByUserName(String userName) {
        Optional<Product> optionalProduct =  productRepository.findByUserName(userName);
        if(!optionalProduct.isEmpty())
        {
            Product product =  optionalProduct.get();
            GetProductResponse productResponse = new GetProductResponse(product.getName(), product.getIngredients(), product.getPrice(), product.getQuantityAvailable());
            return productResponse;
        }

        return null;

    }

    public void deleteProduct (Long userName) {
        productRepository.deleteByUserName(userName);
    }}



