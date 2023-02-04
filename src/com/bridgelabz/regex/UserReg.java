package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {
    static Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
    public static void main(String[] args) {
        System.out.println("Welcome to user registration regex problem!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name starting with capital letter of at-least 3 character : \n");
        String firstName = scanner.nextLine();
        Matcher matcher = pattern.matcher(firstName);
        if ( matcher.matches()){
            System.out.println("First name is valid!");
        }else {
            System.out.println("First is invalid!");
        }

    }
}
