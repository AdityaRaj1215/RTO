package com.rto.service;

import com.rto.dao.UserDAO;
import com.rto.dao.impl.UserDAOImpl;
import com.rto.model.User;

public class UserService {
    private final UserDAO dao = new UserDAOImpl();

    public boolean registerUser(User user) {
        return dao.registerUser(user);
    }

    public User login(String username, String password) {
        return dao.login(username, password);
    }
}
