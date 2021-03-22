package com.leofang.spring.service.impl;

import com.leofang.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("save.....");
    }
}
