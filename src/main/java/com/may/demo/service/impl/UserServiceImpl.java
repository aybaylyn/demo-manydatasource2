package com.may.demo.service.impl;

import com.may.demo.datasource.DataSource;
import com.may.demo.entity.User;
import com.may.demo.repository.UserRepository;
import com.may.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by May on 4/20/17.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @DataSource(readOnly = true)
    @Override
    public User findByName(String userName) {
        return userRepository.findByName(userName);
    }

    @Override
    public Long saveUser(User user) {
        return userRepository.save(user);
    }
}
