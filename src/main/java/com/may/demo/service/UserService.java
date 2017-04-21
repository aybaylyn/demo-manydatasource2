package com.may.demo.service;

import com.may.demo.datasource.DataSource;
import com.may.demo.entity.User;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import sun.nio.cs.US_ASCII;

/**
 * Created by May on 4/20/17.
 */
public interface UserService {

    @DataSource(readOnly = true)
    User findByName(String userName);

    Long saveUser(User user);
}
