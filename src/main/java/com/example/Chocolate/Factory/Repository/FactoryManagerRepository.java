package com.example.Chocolate.Factory.Repository;

import com.example.Chocolate.Factory.Models.FactoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public interface FactoryManagerRepository  extends JpaRepository<FactoryManager, Long> {

    @Autowired
    FactoryManagerRepository factoryManagerRepository = null;

    public default void saveFactoryManager(FactoryManager factoryManager) {
        factoryManagerRepository.save(factoryManager);
    }

    void save(FactoryManager factoryManager);
}


