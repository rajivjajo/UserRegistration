package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class UserRegUtilityTest {

    private UserRegUtility userRegUtility;

    @Before
    public void setUp() {
        userRegUtility = new UserRegUtility();
    }

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        try {
            boolean result = userRegUtility.validateFirstName("Rajiv");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldThrowException() {
        try {
            userRegUtility.validateFirstName("rajiv");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid first name!", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        try {
            boolean result = userRegUtility.validateLastName("Jajo");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldThrowException() {
        try {
            userRegUtility.validateLastName("jajo");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid last name!", e.getMessage());
        }
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        try {
            boolean result = userRegUtility.validateEmail("rajiv.jajo@gmail.com");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldThrowException() {
        try {
            userRegUtility.validateEmail("rajivjajodia.com");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid email address!", e.getMessage());
        }
    }

    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
        try {
            boolean result = userRegUtility.validatePhoneNumber("+91 9999999999");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPhoneNumber_WhenInvalid_ShouldThrowException() {
        try {
            userRegUtility.validatePhoneNumber("+911234567890");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid phone number!", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        try {
            boolean result = userRegUtility.validatePassword("Pass@1234");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldThrowException() {
        try {
            userRegUtility.validatePassword("password123");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid password! Password should have at-least 8 characters, 1 uppercase letter, 1 numeric value and 1 special character.", e.getMessage());
        }
    }
}



