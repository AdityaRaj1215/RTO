package com.rto.main;


import com.rto.ui.RegisterUserUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("==== RTO Management System ====");
            System.out.println("1. Login");
            System.out.println("2. Register ");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice:");
            int ch = sc.nextInt();

            if(ch == 1){
                Login.main(null);
            }else if (ch == 2){
                RegisterUserUI.showRegister();
            } else if (ch==3) {
                break;
            } else{
                System.out.print("Invalid Choice");
            }


        }

}
}
