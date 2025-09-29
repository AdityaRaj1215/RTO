package com.rto.dao;

import com.rto.model.User;

public interface UserDAO {
    boolean registerUser(User user);
    User login(String username, String password);
}
