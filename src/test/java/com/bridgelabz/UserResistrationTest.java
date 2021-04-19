package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javax.naming.InvalidNameException;
import java.util.Scanner;


public class UserResistrationTest {
    /**
     * in case we hava to validatre first name by using junit
     * and minimum character should be 3 and first will be capital
     */
    @Test
    public void demoName() {
        ValidateUser demoname = new ValidateUser();
        boolean result = demoname.userValidator("Ash");
        Assert.assertEquals(true,result);
    }
    /**
     * in case we have to validatre last name by using junit
     * and minimum character should be 3 and first will be capital
     */
    @Test
    public void givenLastNameIs_valid_should_return_true() {
        ValidateUser demoname1 = new ValidateUser();
        boolean result = demoname1.givenLastName_it_should_Return_True("Man");
        Assert.assertEquals(true,result);
    }
    /**
     * in case we have to validatre email address  by using junit
     */
    @Test
    public void givenEmail_Is_valid_Should_return_True() {
        ValidateUser validatEmail = new ValidateUser();
        boolean result = validatEmail.email("abc.xyz@gmail.co.in");
        Assert.assertEquals(true,result);
    }
    /**
     * in case we have to validatre mobile no by using junit
     * and space after 91 8459214148 like
     */

    @Test
    public void givenMobileno_GivesValid_should_Return_true() {
        ValidateUser validatemobileno = new ValidateUser();
        boolean result = validatemobileno.mobileno("91 8459214148");
        Assert.assertEquals(true,result);
    }
    /**
     * in case we have to validatre pssword by using junit
     * and minimum 8 character will be there 1st should be capital 1 special charcter and numeric also in password
     */
    @Test
    public void password_Should_Valid_return_true() {
        ValidateUser validatepassword = new ValidateUser();
        boolean result = validatepassword.password("Ashok@123");
        Assert.assertEquals(true,result);
    }
    /**
     * in case we have to validate happy and sad validate by using junit
     * when we give happy then tts successfully test
     */

    @Test
    public void when_Happy_Itis_Valid_should_Return_True() {
        ValidateUser validate = new ValidateUser();
        boolean result = validate.validate("HAPPY");
        Assert.assertEquals(true,result);
    }
    /**
     * in case we have to validate happy and sad validate by using junit
     * when we give happy then its failed successfully
     */
    @Test
    public void when_Gives_Sad_it_should_beFaild() {
        ValidateUser validate = new ValidateUser();
        boolean result = validate.validate("HAPPY");
        Assert.assertEquals(true,result);
    }
    /**
     * write junit parameterized test to validate multiple entry for the email adress
     */
    @Test
    public void jUnitTestParameterized() {
        ValidateUser validate = new ValidateUser();
            validate.multipleEntries("ashok81800@gmail.com");
            validate.multipleEntries("ashok@gmail.com");
            validate.multipleEntries("james5656@gmail.com");
    }
    /**
     * @method refractor the code to throw custom exception in case of in valid user details
     * @case all test case for invalid first name, last name, email,password,phone no.
     */
    @Test
    public void forInvalidFirstName() throws InvalidNameException {
        ValidateUser demoname = new ValidateUser();
        try {
            boolean result = demoname.invalidFirstName("Ashok");
        }catch (InvalidNameException e){
            System.out.println("Handled");
        }

    }

    @Test

    public void forInvalidLastName() throws InvalidNameException {
        ValidateUser demoname1 = new ValidateUser();
        try {
            boolean result = demoname1.invalidLastName("Mane");

        }catch (InvalidNameException e){
            System.out.println("handled");
        }
    }

    @Test
    public void emailGivesOwnException() {
        ValidateUser validateEmail = new ValidateUser();
       boolean result =  validateEmail.invalidEmailDetails("abc.xyz@gmail.ac.in");
       Assert.assertEquals(true,result);
    }

    @Test
    public void phoneNoGivesOwnException() {
        ValidateUser validateEmail = new ValidateUser();
        boolean result = validateEmail.invalidMobileNo("84592148");
        Assert.assertSame(true,result);
    }
}
