/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationaccountfeature;

import java.util.Scanner;

public class RegistrationAccountFeature {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Login_User login = new Login_User();

        // REGISTER
        System.out.println("=== REGISTER ===");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter phone (+27...): ");
        String phone = scanner.nextLine();

        System.out.println(login.registerUser(username, password, phone));

        // LOGIN
        System.out.println("\n=== LOGIN ===");

        System.out.print("Enter username: ");
        String userLogin = scanner.nextLine();

        System.out.print("Enter password: ");
        String passLogin = scanner.nextLine();

        System.out.println(login.loginUser(userLogin, passLogin, username, password));

        // PART 2 - QUICKCHAT
        System.out.println("\nWelcome to QuickChat.");

        int choice;

        do {

            System.out.println("\nMenu");
            System.out.println("1) Send Message");
            System.out.println("2) Show Recently Sent Message");
            System.out.println("3) Quit");

            System.out.print("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter recipient (+code): ");
                    String recipient = scanner.nextLine();

                    while (!(recipient.startsWith("+") && recipient.length() <= 12)) {
                        System.out.println("Invalid number.");
                        System.out.print("Re-enter: ");
                        recipient = scanner.nextLine();
                    }

                    System.out.print("Enter message: ");
                    String text = scanner.nextLine();

                    while (text.length() > 250) {
                        System.out.println("Message too long.");
                        System.out.print("Re-enter: ");
                        text = scanner.nextLine();
                    }

                    String messageID =
                            String.valueOf((long)(Math.random() * 1000000000L));

                    Message message = new Message(messageID, recipient, text);

                    if (message.checkMessageID()) {
                        System.out.println("Message ID OK");
                    } else {
                        System.out.println("Message ID invalid");
                    }

                    System.out.println("Hash: " + message.createMessageHash());

                    System.out.println("\n1. Send");
                    System.out.println("2. Store");
                    System.out.println("3. Discard");

                    String action = scanner.nextLine();

                    System.out.println(message.sendMessage(action));

                    break;

                case 2:
                    System.out.println("Coming soon...");
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 3);
    }
}
    


     
        
       
        
    
         
       
    


