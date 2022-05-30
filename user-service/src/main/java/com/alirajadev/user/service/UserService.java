package com.alirajadev.user.service;

import com.alirajadev.user.entity.User;

public interface UserService {
    public User getUserById(Long userId);

    public User saveUser(User user);

}
