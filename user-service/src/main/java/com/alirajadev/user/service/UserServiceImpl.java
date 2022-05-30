package com.alirajadev.user.service;

import com.alirajadev.user.entity.User;
import com.alirajadev.user.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long userId) {
        log.info("finding user for " + userId);
        return userRepository.findUserById(userId);
    }

    @Override
    public User saveUser(User user) {
        log.info("saving user " + user);
        return userRepository.save(user);
    }

}
