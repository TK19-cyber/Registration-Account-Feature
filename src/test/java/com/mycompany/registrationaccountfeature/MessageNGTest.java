/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.registrationaccountfeature;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MessageNGTest {

    @Test
    public void testCheckMessageID() {

        Message instance = new Message("24567", "0631883004", "hi");

        boolean result = instance.checkMessageID();

        assertEquals(result, true);
    }

    @Test
    public void testCreateMessageHash() {

    Message instance = new Message("24567", "0631883004", "Hi friend");

    String result = instance.createMessageHash();

    assertEquals(result, "24567:0631883004:Hifriend");
}

    @Test
    public void testSendMessage() {

        Message instance = new Message("24567", "0631883004", "hi");

        String result = instance.sendMessage("send");

        assertEquals(result, "Message sent successfully");
    }

    @Test
    public void testGetMessageID() {

        Message instance = new Message("24567", "0631883004", "hi");

        assertEquals(instance.getMessageID(), "24567");
    }

    @Test
    public void testGetRecipient() {

        Message instance = new Message("24567", "0631883004", "hi");

        assertEquals(instance.getRecipient(), "0631883004");
    }

    @Test
    public void testGetMessage() {

        Message instance = new Message("24567", "0631883004", "hi");

        assertEquals(instance.getMessage(), "hi");
    }
}