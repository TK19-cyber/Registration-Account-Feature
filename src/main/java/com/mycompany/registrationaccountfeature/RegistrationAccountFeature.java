/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationaccountfeature;

import java.util.Scanner;

public class RegistrationAccountFeature {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Login_User login = new Login_User();

        
        System.out.println("=== REGISTER ===");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter phone (+27...): ");
        String phone = scanner.nextLine();

        System.out.println(login.registerUser(username, password, phone));

        // ================= PART 1: LOGIN =================
        System.out.println("\n=== LOGIN ===");

        System.out.print("Enter username: ");
        String userLogin = scanner.nextLine();

        System.out.print("Enter password: ");
        String passLogin = scanner.nextLine();

        System.out.println(login.loginUser(userLogin, passLogin));

        // ================= QUICKCHAT (PART 2 + 3) =================
        System.out.println("\nWelcome to QuickChat");

        int choice;

        do {

            System.out.println("\nMenu");
            System.out.println("1) Send Message");
            System.out.println("2) Show Recently Sent Message");
            System.out.println("3) Show Longest Message");
            System.out.println("4) Search Message by ID");
            System.out.println("5) Search by Recipient");
            System.out.println("6) Delete Message by Hash");
            System.out.println("7) Display Report");
            System.out.println("8) Quit");

            System.out.print("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                // PART 2
                case 1:

    System.out.print("Enter recipient (+code): ");
    String recipient = scanner.nextLine();

    while (!(recipient.startsWith("+") && recipient.length() <= 12)) {
        System.out.println("Invalid number.");
        recipient = scanner.nextLine();
    }

    System.out.print("Enter message: ");
    String text = scanner.nextLine();

    while (text.length() > 250) {
        System.out.println("Message too long.");
        text = scanner.nextLine();
    }

    String messageID =
            String.valueOf((long)(Math.random() * 1000000000L));

    Message message = new Message(messageID, recipient, text);

    System.out.println("Message ID OK: " + message.checkMessageID());
    System.out.println("Hash: " + message.createMessageHash());

    System.out.println("1. Send");
    System.out.println("2. Store");
    System.out.println("3. Discard");

    String action = scanner.nextLine();

   
    String status = message.sendMessage(action);

    System.out.println(status);

    
    if (!status.equalsIgnoreCase("Message discarded")) {
        Message.addMessage(messageID, recipient, text);
    }

    break;
                case 2:
                    System.out.println("Coming soon...");
                    break;

                //  PART 3 
                case 3:
                    System.out.println("Longest Message: " + Message.getLongestMessage());
                    break;

                case 4:
                    System.out.print("Enter Message ID: ");
                    System.out.println(Message.searchByID(scanner.nextLine()));
                    break;

                case 5:
                    System.out.print("Enter Recipient: ");
                    System.out.println(Message.searchByRecipient(scanner.nextLine()));
                    break;

                case 6:
                    System.out.print("Enter Message Hash: ");
                    System.out.println(Message.deleteByHash(scanner.nextLine()));
                    break;

                case 7:
                    System.out.println(Message.displayReport());
                    break;

                case 8:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 8);
    }
}