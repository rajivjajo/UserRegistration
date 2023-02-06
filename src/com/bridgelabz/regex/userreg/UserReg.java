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
            break;
        }
    }
}
