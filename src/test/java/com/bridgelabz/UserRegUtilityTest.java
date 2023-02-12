package com.bridgelabz;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegUtilityTest {
    UserRegUtility userReg;

    @Before
    public void setup() {
        userReg = new UserRegUtility();
    }

    @Test
    public void whenGivenValidFirstNameShouldReturnTrue() {
        boolean validName = userReg.validateFirstName("Rajiv");
        Assertions.assertEquals(true, validName);
    }

    @Test
    public void whenGivenValidLastNameShouldReturnTrue() {
        boolean validName = userReg.validateLastName("Jajo");
        Assertions.assertEquals(true, validName);
    }

    @Test
    public void whenGivenValidEmailShouldReturnTrue() {
        boolean validEmail = userReg.validateEmail("rajiv.jajodia825225@gmail.com");
        Assertions.assertEquals(true, validEmail);
    }

    @Test
    public void whenGivenValidMobileNumberShouldReturnTrue() {
        boolean validMobileNumber = userReg.validatePhoneNumber("919000006909");
        Assertions.assertEquals(true, validMobileNumber);
    }

    @Test
    public void whenGivenValidPasswordShouldReturnTrue() {
        boolean validPassword = userReg.validatePassword("K%j12345");
        Assertions.assertEquals(true, validPassword);
    }

}


