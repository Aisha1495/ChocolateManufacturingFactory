package com.example.Chocolate.Factory.Service;

import com.example.Chocolate.Factory.Models.User;
import com.example.Chocolate.Factory.Repository.UserRepository;
import com.example.Chocolate.Factory.ResponseOpjects.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

//    @Autowired
//    static
//    UserRepository userRepository;


//    public void saveUser(User user) {
//        userRepository.save(user);
//    }
//
//    public static List<User> getUser() {
//        return userRepository.findAll();
//    }
//
//    public GetUserResponse getUserId(Long UserId) {
//        Optional<User> optionalUser =  userRepository.findById(UserId);
//        if(!optionalUser.isEmpty())
//        {
//            User user =  optionalUser.get();
//            GetUserResponse userResponse = new GetUserResponse(user.getUsername(), user.getPassword(), user.getRole());
//            return userResponse;
//        }
//
//        return null;
//
//    }
//
//    public static void deleteUser(Long userId) {
//        Long UserId = null;
//        userRepository.deleteById(UserId);
//    }

}
