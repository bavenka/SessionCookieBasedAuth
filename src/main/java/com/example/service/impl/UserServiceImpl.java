package com.example.service.impl;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * Created by Pavel on 01.01.2017.
 */
@Component
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findOne(long id) throws Exception {
        User user = userRepository.findOne(id);
        if(user == null){
            throw new Exception("User with id " + id + " not found.");
        }
        return user;
    }
}
