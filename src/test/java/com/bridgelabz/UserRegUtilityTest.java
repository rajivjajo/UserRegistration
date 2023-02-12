package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegUtilityTest {
    UserRegUtility userReg;
    private boolean expected;
    private String email;

    public UserRegUtilityTest(boolean expected, String email){
        this.expected = expected;
        this.email=email;
    }


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
    @Parameterized.Parameters
    public static Collection testData(){
        Object[][] sampleEmails = new Object[][]{{true, "abc@yahoo.com"}, {true, "abc-100@yahoo.com"},{true,"abc.100@yahoo.com"}, {true, "abc111@abc.com"}, {true, "abc-100@abc.net"}, {true, "abc.100@abc.com.au"}, {true, "abc@1.com"}, {true, "abc@gmail.com.com"}, {true, "abc+100@gmail.com"}, {false, "abc"}, {false, ".abc@abc.com"}, {false, "abc()*@gmail.com"}, {false, "abc@gmail.com.aa.au"}};
        return Arrays.asList(sampleEmails);
    }
    @Test
    public void WhenGivenSampleEmailShouldReturnTrue(){
        Assertions.assertEquals(expected, userReg.sampleEmails(email));
    }
}


