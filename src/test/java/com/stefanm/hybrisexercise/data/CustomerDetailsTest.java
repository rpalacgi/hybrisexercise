package com.stefanm.hybrisexercise.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stefan on 15-Jan-17.
 */
public class CustomerDetailsTest {

    // unit under test
    private CustomerDetails customerDetailsUnderTest;

    private static final String EMAIL_ADDRESS = "mijatovstefan@gmail.com";
    private static final String POSTAL_CODE = "H3C 0L7";
    private static final String COUNTRY_CODE = "CAN";

    @Before
    public void setup() {
        customerDetailsUnderTest = new CustomerDetails(EMAIL_ADDRESS, POSTAL_CODE, COUNTRY_CODE);
    }

    @Test
    public void testGetters() {
        assertEquals(EMAIL_ADDRESS, customerDetailsUnderTest.getEmail());
        assertEquals(POSTAL_CODE, customerDetailsUnderTest.getPostalCode());
        assertEquals(COUNTRY_CODE, customerDetailsUnderTest.getCountryCode());
    }
}
