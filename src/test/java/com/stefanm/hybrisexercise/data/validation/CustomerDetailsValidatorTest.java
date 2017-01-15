package com.stefanm.hybrisexercise.data.validation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stefan on 15-Jan-17.
 */
public class CustomerDetailsValidatorTest {

    // unit under test
    private CustomerDetailsValidator validatorUnderTest;

    @Before
    public void setup() {
        validatorUnderTest = new CustomerDetailsValidator();
    }

    @Test
    public void testValidateSuccess() {
        assertTrue(validatorUnderTest.validateEmailAddress("mijatovstefan@gmail.com"));
    }

    @Test
    public void testValidateFail() {
        assertFalse(validatorUnderTest.validateEmailAddress("not-a-valid-email-address"));
    }
}
