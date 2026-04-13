/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.quickchat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUsername method, of class Login.
     */
    @Test
    public void testCheckUsernameTrue() {
        System.out.println("checkUsername");
        String username = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
           }
 @Test
    public void testCheckUsernameFalse() {
        System.out.println("checkUsername");
        String username = "kyle!!!!!!!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
           }
    /**
     * Test of checkPassword method, of class Login.
     */
    @Test
    public void testCheckPasswordTrue() {
        System.out.println("checkPassword");
        String passwordComplexity = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPassword(passwordComplexity);
        assertEquals(expResult, result);
       
    }
 @Test
    public void testCheckPasswordFalse() {
        System.out.println("checkPassword");
        String passwordComplexity = "password";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPassword(passwordComplexity);
        assertEquals(expResult, result);
       
    }
    /**
     * Test of checkCellphoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellphoneNumberTrue() {
        System.out.println("checkCellphoneNumber");
        String cellphoneNumber = "+27838968976";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkCellphoneNumber(cellphoneNumber);
        assertEquals(expResult, result);
        
    }
 @Test
    public void testCheckCellphoneNumberFalse() {
        System.out.println("checkCellphoneNumber");
        String cellphoneNumber = "08966553";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellphoneNumber(cellphoneNumber);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUserTrue() {
        System.out.println("registerUser");
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser();
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUserTrue() {
        System.out.println("user login successful");
        Login instance = new Login();
        String username = "kyl_1";
        String password = "Ch&&sec@ke99!";
        String cellphoneNumber= "+27838968976";
        boolean expResult = true;
        boolean result = instance.loginUser();
        assertEquals(expResult,result);
       
        
    }
    
}
