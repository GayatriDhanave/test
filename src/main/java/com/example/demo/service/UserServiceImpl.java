package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean addUser(Users user) {
        Users saved = userRepository.save(user);
        if(saved!=null){return true;}
        return false;
    }
}
