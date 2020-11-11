package com.djz.service.impl;

import com.djz.mapper.UserMapper;
import com.djz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;




}
