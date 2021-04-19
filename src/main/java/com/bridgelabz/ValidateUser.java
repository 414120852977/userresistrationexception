package com.bridgelabz;

import javax.naming.InvalidNameException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUser {
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2}$";
    private static final String EMAIL_TEST_PATTERN = "^[a-z]{3}.[a-z]{3}@[a-z]{5}.[a-z]{2}.[a-z]{2}$";
    private static final String MOBILENO_TEST_PATTERN = "^[0-9]{2}[ ][0-9]{10}$";
    private static final String PASSWORD_TEST_PATTERN ="^[A-Z]{1}[A-Za-z0-9,@,+]{8}$";
    private static final String TEST_PATTERN ="HAPPY";
    private static final String EMAIL_PATTERN ="^[a-z]{4,10}[a-z0-9]{5,7}@[a-z]{5}.[a-z]{3}";

    public boolean userValidator(String fname) {
        System.out.println("enter a first name:");
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
    public boolean givenLastName_it_should_Return_True(String lname) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }
    public boolean email(String email1) {
        Pattern pattern = Pattern.compile(EMAIL_TEST_PATTERN);
        return pattern.matcher(email1).matches();
    }
    public boolean mobileno(String mobileno) {
        Pattern pattern = Pattern.compile(MOBILENO_TEST_PATTERN);
        return pattern.matcher(mobileno).matches();
    }
    public boolean password(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_TEST_PATTERN);
        return pattern.matcher(password).matches();
    }
    public boolean validate(String name) {
        Pattern pattern = Pattern.compile(TEST_PATTERN);
        return pattern.matcher(name).matches();
    }

       public boolean multipleEntries(String email) {
            Pattern pattern = Pattern.compile(EMAIL_PATTERN);
            return pattern.matcher(email).matches();
        }

        public boolean invalidFirstName(String fname) throws InvalidNameException {
            Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
            return pattern.matcher(fname).matches();
        }

    public boolean invalidLastName(String lname) throws InvalidNameException {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }

    public boolean invalidEmailDetails(String email) {
        try {
            Pattern pattern = Pattern.compile(EMAIL_TEST_PATTERN);
            if(!pattern.matcher(email).matches()) {
                throw new InvalidEmailException("Email invalid");
            }
        } catch (InvalidEmailException e){


        }
        return true;
    }
    public boolean invalidMobileNo(String mobileno) {
        try {
            Pattern pattern = Pattern.compile(MOBILENO_TEST_PATTERN);
            if(!pattern.matcher(mobileno).matches()) {
                throw new InvalidMobileException("invalid mobile no");
            }
        } catch (InvalidMobileException e){
            System.out.println(mobileno);

        }
       return true;
    }

}

