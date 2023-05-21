package com.example.Chocolate.Factory.Repository;

import com.example.Chocolate.Factory.Models.FactoryManager;
import com.example.Chocolate.Factory.Models.Inventory;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{
}
