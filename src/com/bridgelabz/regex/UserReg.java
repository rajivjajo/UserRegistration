package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {
    static Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
    static Pattern emailPattern = Pattern.compile("^(abc.)[a-z]{3,}@bl.co.[a-z]{2}$");


    public static void main(String[] args) {
        System.out.println("Welcome to user registration regex problem!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name starting with capital letter of at-least 3 character : \n");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name starting with capital letter of at-least 3 character : \n");
        String lastName = scanner.nextLine();
        System.out.println("Enter email :\n");
        String email = scanner.nextLine();
        Matcher matcher1 = pattern.matcher(firstName);
        Matcher matcher2 = pattern.matcher(lastName);
        Matcher matcher3 = emailPattern.matcher(email);
        if ( matcher1.matches() && matcher2.matches() && matcher3.matches()){
            System.out.println("Name and email is valid!");
        }else {
            System.out.println("Name and email is invalid!");
        }

    }
}
