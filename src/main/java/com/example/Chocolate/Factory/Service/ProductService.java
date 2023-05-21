package com.example.Chocolate.Factory.Service;

import com.example.Chocolate.Factory.Models.Product;
import com.example.Chocolate.Factory.Repository.ProductRepository;
import com.example.Chocolate.Factory.ResponseOpjects.GetProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    @Autowired
    static
    ProductRepository productRepository;


    public static void saveProduct(Product product) {
        productRepository.save(product);
    }

    public static List<Product> getProduct(List<String> strings) {
        return productRepository.findAll();
    }


    public GetProductResponse getEmployeeByUserName(Long userId) {
        Optional<Product> optionalProduct =  productRepository.findById(userId);
        if(!optionalProduct.isEmpty())
        {
            Product product =  optionalProduct.get();
            GetProductResponse productResponse = new GetProductResponse(product.getName(), product.getIngredients(), product.getPrice(), product.getQuantityAvailable());
            return productResponse;
        }

        return null;

    }

    public static void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }



    @RequestMapping("product/get")
    public static List<Product> getProduct() {
        return ProductService.getProduct(ingredientsList());
    }

    private static List<String> ingredientsList() {

        return ingredientsList();
    }


}



