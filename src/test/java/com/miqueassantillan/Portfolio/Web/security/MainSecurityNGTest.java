/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.miqueassantillan.Portfolio.Web.security;

import com.miqueassantillan.Portfolio.Web.security.jwt.JwtTokenFilter;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import static org.testng.Assert.*;

/**
 *
 * @author Miqueas
 */
public class MainSecurityNGTest {
    
    public MainSecurityNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of jwtTokenFilter method, of class MainSecurity.
     */
    @org.testng.annotations.Test
    public void testJwtTokenFilter() {
        System.out.println("jwtTokenFilter");
        MainSecurity instance = null;
        JwtTokenFilter expResult = null;
        JwtTokenFilter result = instance.jwtTokenFilter();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of passwordEncoder method, of class MainSecurity.
     */
    @org.testng.annotations.Test
    public void testPasswordEncoder() {
        System.out.println("passwordEncoder");
        MainSecurity instance = null;
        PasswordEncoder expResult = null;
        PasswordEncoder result = instance.passwordEncoder();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configure method, of class MainSecurity.
     */
    @org.testng.annotations.Test
    public void testConfigure_HttpSecurity() throws Exception {
        System.out.println("configure");
        HttpSecurity http = null;
        MainSecurity instance = null;
        instance.configure(http);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configure method, of class MainSecurity.
     */
    @org.testng.annotations.Test
    public void testConfigure_AuthenticationManagerBuilder() throws Exception {
        System.out.println("configure");
        AuthenticationManagerBuilder auth = null;
        MainSecurity instance = null;
        instance.configure(auth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticationManagerBean method, of class MainSecurity.
     */
    @org.testng.annotations.Test
    public void testAuthenticationManagerBean() throws Exception {
        System.out.println("authenticationManagerBean");
        MainSecurity instance = null;
        AuthenticationManager expResult = null;
        AuthenticationManager result = instance.authenticationManagerBean();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class MainSecurity.
     */
    @org.testng.annotations.Test
    public void testInit() throws Exception {
        System.out.println("init");
        HttpSecurity builder = null;
        MainSecurity instance = null;
        instance.init(builder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
