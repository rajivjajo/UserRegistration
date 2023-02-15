package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {

    public static void main(String[] args) throws UserRegistrationException {
        System.out.println("Welcome to user registration regex problem!");
        Scanner scanner = new Scanner(System.in);
        UserRegUtility userRegUtility = new UserRegUtility();
        System.out.println();

        System.out.println("Enter first name : ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name : ");
        String lastName = scanner.nextLine();
        System.out.println("Enter Email : ");
        String emailId = scanner.nextLine();
        System.out.println("Enter Phone number : ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter Password : ");
        String password = scanner.nextLine();


        userRegUtility.validateFirstName(firstName);
        userRegUtility.validateLastName(lastName);
        userRegUtility.validateEmail(emailId);
        userRegUtility.validatePhoneNumber(phoneNumber);
        userRegUtility.validatePassword(password);

        System.out.println("----------Sample Emails-------------");
        String[] arrayOfSampleValidEmail = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        System.out.println("Checking all Valid Sample!!!");
        for (int i = 0; i < arrayOfSampleValidEmail.length; i++) {
            userRegUtility.sampleEmails(arrayOfSampleValidEmail[i]);
        }
        System.out.println();
        String[] arrayOfSampleInvalidEmail = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", ".abc@abc.com", "abc()*@gmail.com", "abc123@.com.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
        System.out.println("Checking all InValid Sample!!!");
        for (int i = 0; i < arrayOfSampleInvalidEmail.length; i++) {
            userRegUtility.sampleEmails(arrayOfSampleInvalidEmail[i]);
        }
    }
}
