/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationaccountfeature;

/**
 *
 * @author Troy Khumalo
 */
import java.util. Scanner;
public class RegistrationAccountFeature {

    public static void main(String[] args) {
       
            Scanner input = new Scanner(System.in);
        Login_User login = new Login_User();

        // REGISTER
        System.out.println("=== REGISTER ===");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter phone (+27...): ");
        String phone = input.nextLine();

        System.out.println(login.registerUser(username, password, phone));

        // LOGIN
        System.out.println("\n=== LOGIN ===");

        System.out.print("Enter username: ");
        String userLogin = input.nextLine();

        System.out.print("Enter password: ");
        String passLogin = input.nextLine();

        System.out.println(login.loginUser(userLogin, passLogin, "Kyle", "Smith"));   
    }
}
