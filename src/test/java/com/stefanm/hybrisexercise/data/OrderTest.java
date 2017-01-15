package com.stefanm.hybrisexercise.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Stefan on 15-Jan-17.
 */
public class OrderTest {

    // the unit under test
    private Order orderUnderTest;

    // test data
    private static final int TEST_ORDER_ID = 123456;

    private static final int TEST_PRODUCT_ID_ONE = 123;
    private static final int TEST_PRODUCT_QUANTITY_ONE = 5;
    private static final double TEST_PRODUCT_PRICE_ONE = 2.5;

    private static final int TEST_PRODUCT_ID_TWO = 124;
    private static final int TEST_PRODUCT_QUANTITY_TWO = 3;
    private static final double TEST_PRODUCT_PRICE_TWO = 1.5;

    private static final double TEST_TOTAL_COST = 17;

    private static final double TEST_DELTA = 0.001;

    @Before
    public void setup() {
        orderUnderTest = new Order(TEST_ORDER_ID, Currency.CAD);
    }

    @Test
    public void testOrderCreated() {
        assertEquals(TEST_ORDER_ID, orderUnderTest.getOrderID());
        assertEquals(Currency.CAD, orderUnderTest.getOrderCurrency());

        assertNotNull(orderUnderTest.getOrderDate());
        assertEquals(OrderStatus.OPEN, orderUnderTest.getOrderStatus());

        assertNotNull(orderUnderTest.getOrderItems());
        assertEquals(0, orderUnderTest.getOrderItems().size());
        assertEquals(0, orderUnderTest.getTotalCost(), TEST_DELTA);
    }

    @Test
    public void testTotalCost() {

        orderUnderTest.addLineItem(new LineItem(TEST_PRODUCT_ID_ONE, TEST_PRODUCT_QUANTITY_ONE, TEST_PRODUCT_PRICE_ONE));
        orderUnderTest.addLineItem(new LineItem(TEST_PRODUCT_ID_TWO, TEST_PRODUCT_QUANTITY_TWO, TEST_PRODUCT_PRICE_TWO));
        assertEquals(TEST_TOTAL_COST, orderUnderTest.getTotalCost(), TEST_DELTA);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testItemsNotModifiable() {
        orderUnderTest.getOrderItems().add(new LineItem(TEST_PRODUCT_ID_ONE, TEST_PRODUCT_QUANTITY_ONE, TEST_PRODUCT_PRICE_ONE));
    }
}