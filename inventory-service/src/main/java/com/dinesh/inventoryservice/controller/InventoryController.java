package com.dinesh.inventoryservice.controller;

import com.dinesh.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean inStock(@PathVariable("sku-code") String skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
