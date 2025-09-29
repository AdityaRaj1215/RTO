package com.rto.dao.impl;

import com.rto.dao.UserDAO;
import com.rto.model.User;
import com.rto.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAOImpl implements UserDAO {

    @Override
    public boolean registerUser(User user) {
        String sql = "INSERT INTO users (username, password, role, owner_id) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());  // In production, hash password!
            ps.setString(3, user.getRole());      // usually "user"
            ps.setInt(4, user.getOwnerId());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.err.println("❌ Error registering user: " + e.getMessage());
            return false;
        }
    }

    @Override
    public User login(String username, String password) {
        String sql = "SELECT * FROM users WHERE username=? AND password=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new User(
                        rs.getInt("user_id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("role"),
                        rs.getInt("owner_id")
                );
            }
        } catch (Exception e) {
            System.err.println("❌ Login failed: " + e.getMessage());
        }
        return null;
    }
}
