package com.bridglabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    UserValidation userValidation = new UserValidation();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userValidation.validateFirstName("Madhu");
        Assertions Assert = null;
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userValidation.validateFirstName("Madhu23425");
        Assertions Assert = null;
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userValidation.validateLastName("Kahar");
        Assertions Assert = null;
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userValidation.validateLastName("Kaha2323452r");
        Assertions Assert = null;
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userValidation.validateEmail("abc+def@33ff.co.in");
        Assertions Assert = null;
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        boolean result = userValidation.validateEmail("RDdef@33ff.co.ind");
        Assertions Assert = null;
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean result = userValidation.validateMobileNumber("91 9967997037");
        Assertions Assert = null;
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
        boolean result = userValidation.validateMobileNumber("919967997037");
        Assertions Assert = null;
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenMatched_ShouldReturnTrue() {
        boolean result = userValidation.validatePassword("nvghyHilu6@gbvh7");
        Assertions Assert = null;
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotMatched_ShouldReturnFalse() {
        boolean result = userValidation.validatePassword("nnftrnkj@atil747i");
        Assertions Assert = null;
        Assert.assertFalse(result);
    }
}