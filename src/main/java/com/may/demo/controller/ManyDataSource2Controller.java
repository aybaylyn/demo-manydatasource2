package com.may.demo.controller;

import com.may.demo.entity.User;
import com.may.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by May on 4/18/17.
 */

@RestController
@RequestMapping("/manydatasoures2")
public class ManyDataSource2Controller {

    @Autowired
    private UserService userService;


    @RequestMapping("/testMaster")
    public User testDs1(String userName) {

        User user = new User();
        user.setUserName("999");
        user.setPassword("999");
        userService.saveUser(user);
        return  user;

    }

    @RequestMapping("/testSlave")
    public User testDs2(String userName) {
        return userService.findByName(userName);
    }
}
