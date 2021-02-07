package com.aitu.spring.service;

import com.aitu.spring.model.User;
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
