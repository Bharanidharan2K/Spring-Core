package com.infikart;

import java.util.Scanner;

public class InfikartApplication {
    public static void main( String[] args ) {
        ClientMessagingSystem cms = new ClientMessagingSystem();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Address :");
        String address = sc.nextLine();
        System.out.println("Enter the Message :");
        String message = sc.nextLine();
        sc.close();
        cms.send(address, message);
    }
}
