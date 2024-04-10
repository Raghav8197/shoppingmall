package com.example.demo;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShopController {

    @Autowired
    private ShopService service;
    
    // RESTful API methods for Retrieval operations
    @GetMapping("/getshop")
    public List<ShopEntity> list() {
        return service.listAll();
    }

    @GetMapping("/shop/{id}")
    public ResponseEntity<ShopEntity> get(@PathVariable(name = "id") Integer id) {
        try {
            ShopEntity shop = service.get(id);
            return new ResponseEntity<ShopEntity>(shop, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<ShopEntity>(HttpStatus.NOT_FOUND);
        }
    }

    // RESTful API method for Create operation
    @PostMapping("/shop")
    public void add(@RequestBody ShopEntity shop) {
        service.save(shop);
    }

    // RESTful API method for Update operation
    @PutMapping("/shop/{id}")
    public ResponseEntity<?> update(@RequestBody ShopEntity shop, @PathVariable(name = "id") Integer id) {
        try {
            ShopEntity existShop = service.get(id);
            service.save(shop);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // RESTful API method for Delete operation
    @DeleteMapping("/shop/{id}")
    public void delete(@PathVariable(name = "id") Integer id) {
        service.delete(id);
    }
}
