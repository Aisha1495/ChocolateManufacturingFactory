package com.example.Chocolate.Factory.Service;

import com.example.Chocolate.Factory.Models.FactoryManager;
import com.example.Chocolate.Factory.Repository.FactoryManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactoryManagerService {

    @Autowired
    FactoryManagerRepository factoryManagerRepository;

    public void saveFactoryManager(FactoryManager factoryManager) {
        factoryManagerRepository.save(factoryManager);
    }

    void save(FactoryManager factoryManager) {

    }
}
