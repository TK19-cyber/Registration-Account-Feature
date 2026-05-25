/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationaccountfeature;

/**
 *
 * @author Student
 */
public class Message {
  



    private String messageID;
    private String recipient;
    private String message;

    // Constructor
    public Message(String messageID, String recipient, String message) {
        this.messageID = messageID;
        this.recipient = recipient;
        this.message = message;
    }

    // Check Message ID (max 10 characters)
    public boolean checkMessageID() {
        if (messageID == null) {
            return false;
        }
        return messageID.length() <= 10;
    }

    // Create message hash
    public String createMessageHash() {

        String[] words = message.split(" ");

        String firstWord = words[0];

        String lastWord = words[words.length - 1];

        return messageID + ":" + recipient + ":" + firstWord + lastWord;
    }

    // Send / Store / Discard
    public String sendMessage(String action) {

        if (action.equals("1") || action.equalsIgnoreCase("send")) {
            return "Message sent successfully";
        } 
        else if (action.equals("2") || action.equalsIgnoreCase("store")) {
            return "Message stored successfully";
        } 
        else if (action.equals("3") || action.equalsIgnoreCase("discard")) {
            return "Message discarded";
        } 
        else {
            return "Invalid action";
        }
    }

    // Getters (basic level)
    public String getMessageID() {
        return messageID;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }
}

