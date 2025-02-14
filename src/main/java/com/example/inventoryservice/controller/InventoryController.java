package com.example.inventoryservice.controller;

import com.example.inventoryservice.service.InventoryService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping
    public boolean isInventoryInStock(@PathParam("skuCode") String skuCode,@PathParam("quantity") Integer quantity){
        return inventoryService.isInStock(skuCode, quantity);

    }
}
