package com.stefanm.hybrisexercise.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stefan on 15-Jan-17.
 */
public class LineItemTest {

    // unit under test
    private LineItem lineItemUnderTest;

    // test data
    private static final int TEST_PRODUCT_ID = 10;
    private static final int TEST_PRODUCT_QUANTITY = 20;
    private static final double TEST_PRODUCT_PRICE = 2.5;

    private static final double TEST_DELTA = 0.001;

    @Before
    public void setup() {
        lineItemUnderTest = new LineItem(TEST_PRODUCT_ID, TEST_PRODUCT_QUANTITY, TEST_PRODUCT_PRICE);
    }

    @Test
    public void testGetters() {

        assertEquals(TEST_PRODUCT_ID, lineItemUnderTest.getProductID());
        assertEquals(TEST_PRODUCT_QUANTITY, lineItemUnderTest.getQuantity());
        assertEquals(TEST_PRODUCT_PRICE, lineItemUnderTest.getPrice(), TEST_DELTA);
    }
}