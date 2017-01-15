package com.stefanm.hybrisexercise.data;

/**
 * Created by Stefan on 15-Jan-17.
 */
public enum Currency {

    CAD("CAD"), USD("USD");

    private String value;

    /**
     * Default constructor, setting up the string representation of a currency.
     *
     * @param value the string representation of the currency.
     */
    Currency(String value) {
        this.value = value;
    }

    /**
     * Value getter.
     *
     * @return the string representation of the currency.
     */
    public String getValue() {
        return value;
    }
}