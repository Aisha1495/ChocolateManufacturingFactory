package com.example.Chocolate.Factory.Repository;

import com.example.Chocolate.Factory.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByPriceGreaterThan(double price);
    List<Product> findByIngredientsContaining(String ingredient);
    List<Product> findByQuantityAvailableGreaterThanOrderByPriceAsc(int quantity);

    Optional<Product> findByUserName(String userName);

    void deleteByUserName(Long userName);
}
