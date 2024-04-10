package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ShopService {

    @Autowired
    private ShopRepository repo;

    public List<ShopEntity> listAll() {
        return repo.findAll();
    }

    public void save(ShopEntity shop) {
        repo.save(shop);
    }

    public ShopEntity get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
