package com.rto.ui;

import com.rto.model.User;
import com.rto.service.UserService;

import java.util.Scanner;

public class RegisterUserUI {
    private static final Scanner sc = new Scanner(System.in);
    private static final UserService service = new UserService();

    public static void showRegister() {
        System.out.println("\n==== Register New User ====");
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.print("Enter Owner ID (must exist in owners table): ");
        int ownerId = sc.nextInt();
        sc.nextLine();

        User user = new User(username, password, "user", ownerId);
        boolean success = service.registerUser(user);

        if (success) {
            System.out.println("✅ User registered successfully!");
        } else {
            System.out.println("❌ Failed to register user. Try again.");
        }
    }
}
