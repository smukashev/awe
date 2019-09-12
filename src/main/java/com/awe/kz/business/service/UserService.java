package com.awe.kz.business.service;

import com.awe.kz.data.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
