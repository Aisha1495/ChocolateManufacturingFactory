package com.example.Chocolate.Factory.Service;

import com.example.Chocolate.Factory.Models.Inventory;
import com.example.Chocolate.Factory.Models.Product;
import com.example.Chocolate.Factory.Repository.InventoryRepository;
import com.example.Chocolate.Factory.ResponseOpjects.GetInventoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {


    @Autowired
    InventoryRepository inventoryRepository;


    public void saveInventory(Inventory inventory) {
        inventoryRepository.save(inventory);
    }

    public List<Inventory> getInventory() {
        return inventoryRepository.findAll();
    }


    public GetInventoryResponse getInventoryById(Long inventoryId) {
        Optional<Inventory> optionalInventory =  inventoryRepository.findById(inventoryId);
        if(!optionalInventory.isEmpty())
        {
            Inventory inventory=  optionalInventory.get();
            GetInventoryResponse inventoryResponse = new GetInventoryResponse(inventory.getProductId(),inventory.getId(),inventory.getQuantityAvailable());
            return inventoryResponse;

        }


        return null;

    }



}
