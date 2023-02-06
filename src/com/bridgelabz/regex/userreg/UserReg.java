package com.bridgelabz.regex.userreg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {

    public static void main(String[] args) {
        System.out.println("Welcome to user registration regex problem!");
        Scanner scanner = new Scanner(System.in);
        boolean validOutput = false;
        UserRegUtility userRegUtility = new UserRegUtility();
        System.out.println();
        while ( validOutput == false ){
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

            System.out.println("_________________________Email Sample check ___________________________");

                System.out.println("Checking all Valid Sample!!!");
                userRegUtility.validateEmail("abc@yahoo.com");
                userRegUtility.validateEmail("abc-100@yahoo.com");
                userRegUtility.validateEmail("abc.100@yahoo.com");
                userRegUtility.validateEmail("abc111@abc.com");
                userRegUtility.validateEmail("abc-100@abc.net");
                userRegUtility.validateEmail("abc.100@abc.com.au");
                userRegUtility.validateEmail("abc@1.com");
                userRegUtility.validateEmail("abc@gmail.com.com");
                userRegUtility.validateEmail("abc+100@gmail.com");
                System.out.println();
                System.out.println("Checking all InValid Sample!!!");
                userRegUtility.validateEmail("abc");
                userRegUtility.validateEmail("abc@.com.my");
                userRegUtility.validateEmail("abc123@gmail.a");
                userRegUtility.validateEmail("abc123@.com");
                userRegUtility.validateEmail(".abc@abc.com");
                userRegUtility.validateEmail("abc()*@gmail.com");
                userRegUtility.validateEmail("abc123@.com.com");
                userRegUtility.validateEmail("abc@%*.com");
                userRegUtility.validateEmail("abc..2002@gmail.com");
                userRegUtility.validateEmail("abc.@gmail.com");
                userRegUtility.validateEmail("abc@abc@gmail.com");
                userRegUtility.validateEmail("abc@gmail.com.1a");
                userRegUtility.validateEmail("abc@gmail.com.aa.au");

            break;
        }
    }
}
