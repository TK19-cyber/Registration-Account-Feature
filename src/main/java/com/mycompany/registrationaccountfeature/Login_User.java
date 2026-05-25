/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Troy khumalo  
 */
package com.mycompany.registrationaccountfeature;

public class Login_User {

    private String userName;
    private String Password;
    private String Number;

    public boolean checkUserName(String userName){
        return userName.contains("_") && userName.length() <= 5;
    }

    public boolean checkPassword(String Password) {
        return Password.length() >= 8 &&
               Password.matches(".*[A-Z].*") &&
               Password.matches(".*\\d.*") &&
               Password.matches(".*[^a-zA-Z0-9].*");
    }

    public boolean checkCellPhoneNumber(String Number){
        return Number.matches("^\\+27\\d{9}$");
    }

    public String registerUser(String username, String Password, String number) {

        if(!checkUserName(username)){
            return "Invalid username";
        }

        if(!checkPassword(Password)){
            return "Invalid password";
        }

        if(!checkCellPhoneNumber(number)){
            return "Invalid phone number";
        }

        this.userName = username;
        this.Password = Password;
        this.Number = number;

        return "User successfully registered!";
    }

    public String loginUser(String username, String password, String firstName, String lastName) {

       
            return "Welcome " + firstName + " " + lastName;
        }

      
    }
