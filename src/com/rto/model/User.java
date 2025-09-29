package com.rto.model;

public class User {
    private int userId;
    private String username;
    private String password;
    private String role;
    private int ownerId;

    public User() {}

    public User(String username, String password, String role, int ownerId) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.ownerId = ownerId;
    }

    public User(int userId, String username, String password, String role, int ownerId) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
        this.ownerId = ownerId;
    }

    // Getters & Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public int getOwnerId() { return ownerId; }
    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                ", ownerId=" + ownerId +
                '}';
    }
}
