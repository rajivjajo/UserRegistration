package com.bridgelabz;

import com.bridgelabz.InvalidUserDetailsException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegUtility {
    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        String validFirstName = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(validFirstName);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("First Name is valid!!");
            return true;
        } else {
            throw new UserRegistrationException("Invalid first name!");
        }
    }

    public boolean validateLastName(String lastName) throws UserRegistrationException {
        String validLastName = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(validLastName);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Last name is valid!!");
            return true;
        } else {
            throw new UserRegistrationException("Invalid last name!");
        }
    }

    public boolean validateEmail(String email) throws UserRegistrationException {
        String ValidEmail = "^[a-z0-9]+[_+-.]?[a-z0-9]*[^_+-.][@]([a-z0-9])+([.][a-z]{2,})(.[a-z]{2,3})?$";
        Pattern pattern = Pattern.compile(ValidEmail);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Email-ID is valid!!");
            return true;
        } else {
            throw new UserRegistrationException("Invalid email address!");
        }
    }

    public boolean validatePhoneNumber(String phoneNumber) throws UserRegistrationException {
        String phoneNum = "^[+]?[0-9]{2}[ ]?[1-9]{1}[0-9]{9}$";
        Pattern pattern = Pattern.compile(phoneNum);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("Phone number is valid!!");
            return true;
        } else {
            throw new UserRegistrationException("Invalid phone number!");
        }
    }

    public boolean validatePassword(String passWord) throws UserRegistrationException {
        String passWordSet = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(passWordSet);
        Matcher matcher = pattern.matcher(passWord);
        if (matcher.matches()) {
            System.out.println("Password is fine!!");
            return true;
        } else {
            throw new UserRegistrationException("Invalid password! Password should have at-least 8 characters, 1 uppercase letter, 1 numeric value and 1 special character.");
        }
    }

    public boolean sampleEmails(String emails) throws UserRegistrationException{
       String emailPattern = "^[a-z0-9]+[_+-.]?[a-z0-9]*[^_+-.][@]([a-z0-9])+([.][a-z]{2,})(.[a-z]{2,3})?$";
       Pattern pattern = Pattern.compile(emailPattern);
       Matcher matcher = pattern.matcher(emails);
       if (matcher.matches()){
           System.out.println("Valid Email");
           return true;
       }else {
           throw new UserRegistrationException("Invalid email pattern .");
       }
    }
}

