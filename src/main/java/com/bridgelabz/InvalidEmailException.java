package com.bridgelabz;

public class InvalidEmailException extends Exception {
    public InvalidEmailException(String email_invalid) {
        System.out.println("Invalid email");
    }

}
