package com.example.Chocolate.Factory.Service;

import com.example.Chocolate.Factory.Models.Inventory;
import com.example.Chocolate.Factory.Models.Order;
import com.example.Chocolate.Factory.Repository.InventoryRepository;
import com.example.Chocolate.Factory.Repository.OrderRepository;
import com.example.Chocolate.Factory.ResponseOpjects.GetInventoryResponse;
import com.example.Chocolate.Factory.ResponseOpjects.GetOrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {
    @Autowired
    static
    InventoryRepository inventoryRepository;


    public static void saveInventory(Inventory inventory) {
        inventoryRepository.save(inventory);
    }

    public static List<Inventory> getInventory() {
        return inventoryRepository.findAll();
    }


    public GetInventoryResponse getInventoryByUserName(Long inventoryId) {
        Optional<Inventory> optionalInventory =  inventoryRepository.findById(inventoryId);
        if(!optionalInventory.isEmpty())
        {
            Inventory inventory=  optionalInventory.get();
            GetInventoryResponse InventoryResponse = new GetInventoryResponse();
            return InventoryResponse;

        }

        return null;

    }

    public static void deleteInventory(Long inventoryId) {
        inventoryRepository.deleteById(inventoryId);
    }




}
