package com.stefanm.hybrisexercise.data;

/**
 * Created by Stefan on 15-Jan-17.
 */
public enum OrderStatus {

    OPEN("OPEN"), PAID("PAID"), PAY_FAILED("PAY_FAILED");

    /**
     * String representation of an order status.
     */
    private String value;

    /**
     * Default constructor, setting up the string representation of an order status.
     *
     * @param value the string representation of the order status.
     */
    OrderStatus(String value) {
        this.value = value;
    }
}
