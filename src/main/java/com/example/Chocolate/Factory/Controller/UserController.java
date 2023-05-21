package com.example.Chocolate.Factory.Controller;

import com.example.Chocolate.Factory.Models.User;
import com.example.Chocolate.Factory.RequestObjects.GetUserRequestObject;
import com.example.Chocolate.Factory.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //create
    @RequestMapping("user/create")
    public void saveUser (@RequestBody GetUserRequestObject UserRequestObject) {
        createUser(UserRequestObject);
    }

    //get
    @RequestMapping("user/get")
    public List<User> getUser () {
        return UserService.getUser();
    }

    //delete
    @RequestMapping("user/delete/{employeeId}")
    public void deleteUser (@PathVariable Long UserId) {
        UserService.deleteUser(UserId);
    }


    public void createUser(GetUserRequestObject userRequestObject) {
        User user = new User();
        user.setId(1234L);
        user.setUsername("Aisha123");
        user.setPassword("A@12345");
        user.setRole("admin");
        user.setCreatedDate(new Date());
        user.setIsActive(true);
        userService.saveUser(user);

    }
}
