package com.example.Chocolate.Factory.Controller;

import com.example.Chocolate.Factory.Models.Inventory;
import com.example.Chocolate.Factory.Models.Orders;
import com.example.Chocolate.Factory.RequestObjects.GetInventoryRequestObject;
import com.example.Chocolate.Factory.RequestObjects.GetOrderRequestObject;
import com.example.Chocolate.Factory.Service.InventoryService;
import com.example.Chocolate.Factory.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")

public class InventoryController {
    @Autowired
    InventoryService inventoryService;


    //create
    @RequestMapping("inventory/create")
    public void saveInventory(@RequestBody GetInventoryRequestObject InventoryRequestObject) {
        Object inventoryRequestObject = new Object();
        createInventory((GetInventoryRequestObject) inventoryRequestObject);
    }



    //get
    @RequestMapping("inventory/get")
    public List<Inventory> getInventory() {
        return inventoryService.getInventory();
    }



//    //update
//    @PutMapping("/{inventoryId}")
//    public Inventory updateInventory(@PathVariable Long inventoryId, @RequestBody Inventory updatedInventory) {
//
//        return updatedInventory;
//    }

//
//    //delete
//    @DeleteMapping("/{inventoryId}")
//    public void deleteInventory(@PathVariable Long inventoryId) {
//        try {
//            InventoryService.deleteInventory(inventoryId);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }




    private void createInventory(GetInventoryRequestObject inventoryRequestObject) {
        Inventory inventory = new Inventory();
        inventory.setProductId(1445L);
        inventory.setQuantityAvailable(600);

        inventoryService.saveInventory(inventory);

    }


}