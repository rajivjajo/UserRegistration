package com.bridgelabz.regex.userreg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegUtility {
    public boolean validateFirstName(String firstName) {
        String validFirstName = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(validFirstName);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("First Name is valid!!");
            return true;
        } else {
            System.out.println("First Name is Invalid!!");
            return false;
        }
    }

    public boolean validateLastName(String lastName) {
        String validLastName = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(validLastName);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Last name is valid!!");
            return true;
        } else {
            System.out.println("Last name is Invalid!!");
            return false;
        }
    }

    public boolean validateEmail(String email) {
        String ValidEmail = "^[a-z0-9]+[_+-.]?[a-z0-9]*[^_+-.][@]([a-z0-9])+([.][a-z]{2,})(.[a-z]{2,3})?$";
        Pattern pattern = Pattern.compile(ValidEmail);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Email-ID is valid!!");
            return true;
        } else {
            System.out.println("Email-ID is Invalid!!");
            return false;
        }
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        String phoneNum = "^[0-9]+[ ][1-9]{1}[0-9]{9}$";
        Pattern pattern = Pattern.compile(phoneNum);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("Phone number is valid!!");
            return true;
        } else {
            System.out.println("Phone number is Invalid!!");
            return false;
        }
    }

    public boolean validatePassword(String passWord) {
            String passWordSet = "^.{8,}(?=.*[0-9]).+(?=.*[!@#$%^&*(),.?\":{}|<>]).+$";
            Pattern pattern = Pattern.compile(passWordSet);
            Matcher matcher = pattern.matcher(passWord);
            if (matcher.matches()) {
                System.out.println("Password is fine!!");
                return true;
            } else {

                System.out.println("Password should have at-least 8 chracters , 1 letter should be upper case  one numeric value and 1 special character !!");

                return false;
            }
        }
    }

