package com.example.Chocolate.Factory.Repository;

import com.example.Chocolate.Factory.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
