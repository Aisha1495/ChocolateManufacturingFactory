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

    ProductRepository productRepository;


    public void saveProduct(Product product) {productRepository.save(product);
    }

    public List<Product> getProduct() {
        return productRepository.findAll();
    }


    public GetProductResponse getProductById(Long productId) {
        Optional<Product> optionalProduct =  productRepository.findById(productId);
        if(!optionalProduct.isEmpty())
        {
            Product product =  optionalProduct.get();
            GetProductResponse productResponse = new GetProductResponse(product.getName(),product.getIngredients(),product.getPrice(),product.getQuantityAvailable());
            return productResponse;
        }

        return null;

    }

//    public void deleteProduct(Long productId) {
//        productRepository.deleteById(productId);
//    }
//
//
//    public void saveOrUpdate(Product product) {
//        productRepository.save(product);
//    }
//

//    public Product updateProduct(Long id, Product updateData){
//        Product product = productRepository.findById(id).orElse(null);
//        if (product != null) {
//            product.setName(updateData.getName());
//            product.setPrice(updateData.getPrice());
//            product.setQuantityAvailable(updateData.getQuantityAvailable());
//            product.setIngredients(updateData.getIngredients());
//
//
//            return productRepository.save(product);
//        }
//        return null;
//    }


}



