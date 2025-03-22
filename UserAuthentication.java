package com.mycompany.personalfinancemanager;

import java.util.Scanner;

public class UserAuthentication {

    private Scanner scan = new Scanner(System.in);

    public boolean login() {
        // Authentication logic
        System.out.print("Enter username: ");
        String username = scan.nextLine();
        System.out.print("Enter password: ");
        String password = scan.nextLine();

        // Basic authentication logic (replace with actual logic)
        return username.equals("user") && password.equals("password");
    }

    public boolean register() {
        // Registration logic
        System.out.print("Enter new username: ");
        String username = scan.nextLine();
        System.out.print("Enter new password: ");
        String password = scan.nextLine();

        // For now, we assume registration always succeeds
        System.out.println("Registration successful!");
        return true;
    }
}
