/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.registrationaccountfeature;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Student
 */
public class Login_UserNGTest {
    
    public Login_UserNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of checkUserName method, of class Login_User.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String userName = "";
        Login_User instance = new Login_User();
        boolean expResult = false;
        boolean result = instance.checkUserName(userName);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkPassword method, of class Login_User.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String Password = "";
        Login_User instance = new Login_User();
        boolean expResult = false;
        boolean result = instance.checkPassword(Password);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login_User.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String Number = "";
        Login_User instance = new Login_User();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(Number);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of registerUser method, of class Login_User.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "_Troy";
        String Password = "Password2@";
        String number = "+27837198970";
        Login_User instance = new Login_User();
        String expResult = "User successfully registered!";
        String result = instance.registerUser(username, Password, number);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of loginUser method, of class Login_User.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "_Troy";
        String password = "Password2@";
        String firstName = "Troy";
        String lastName = "Khumalo";
        Login_User instance = new Login_User();
        String expResult = "Username or password incorrect";
        String result = instance.loginUser(username, password, firstName, lastName);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
