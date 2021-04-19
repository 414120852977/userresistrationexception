package com.bridgelabz;

public class InvalidMobileException extends Throwable {
    public InvalidMobileException(String invalid_mobile_no) {
        System.out.println("invalid mobile no given");
    }
}
