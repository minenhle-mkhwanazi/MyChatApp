/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
    }

    /**
     * Test of checkUsername method, of class Login.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username1 = "";
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.checkUsername(username1);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPassword method, of class Login.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.checkPassword();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckPhoneNumber() {
        System.out.println("checkPhoneNumber");
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.checkPhoneNumber();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "Job_e";
        String password = "";
        String phoneNumber = "";
        Login instance = null;
        String expResult = "";
        String result = instance.registerUser(username, password, phoneNumber);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("LoginUser");
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.LoginUser();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
