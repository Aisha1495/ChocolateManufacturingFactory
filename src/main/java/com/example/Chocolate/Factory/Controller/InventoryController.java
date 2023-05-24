package com.example.Chocolate.Factory.Controller;

import com.example.Chocolate.Factory.Models.Inventory;
import com.example.Chocolate.Factory.Models.Order;
import com.example.Chocolate.Factory.Models.Product;
import com.example.Chocolate.Factory.Repository.InventoryRepository;
import com.example.Chocolate.Factory.Repository.ProductRepository;
import com.example.Chocolate.Factory.RequestObjects.GetInventoryRequestObject;
import com.example.Chocolate.Factory.RequestObjects.GetOrderRequestObject;
import com.example.Chocolate.Factory.Service.InventoryService;
import com.example.Chocolate.Factory.Service.OrderService;
import com.example.Chocolate.Factory.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")

public class InventoryController {
    @PostMapping
    public Inventory placeInventory(@RequestBody Inventory inventory) {


        return inventory;
    }

    //create
    @RequestMapping("inventory/create")
    public void saveInventory(@RequestBody GetInventoryRequestObject inventoryRequestObject) {
        Object InventoryRequestObject = new Object();
        createInventory(inventoryRequestObject);
    }

    //get
    @RequestMapping("inventory/get")
    public List<Inventory> getInventory() {
        return InventoryService.getInventory();
    }

    //update
    @PutMapping("/{inventoryId}")
    public Inventory updateInventory(@PathVariable Long inventoryId, @RequestBody Inventory updatedInventory) {

        return updatedInventory;
    }


    //delete
    @DeleteMapping("/{inventoryId}")
    public void deleteInventory(@PathVariable Long inventoryId) {
        try {
            InventoryService.deleteInventory(inventoryId);
        }catch (Exception e){
            e.printStackTrace();
        }

    }




    private void createInventory(GetInventoryRequestObject inventoryRequestObject) {
        Inventory inventory = new Inventory();
        inventory.setId(5555L);
        inventory.setProductId(1445L);
        inventory.setQuantityAvailable(600);

        InventoryService.saveInventory(inventory);

    }


}