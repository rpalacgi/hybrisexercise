package com.stefanm.hybrisexercise.data;

/**
 * Created by Stefan on 15-Jan-17.
 */
public class CustomerDetails {

    private String email;
    private String postalCode;
    private String countryCode;

    /**
     * Default constructor, setting up the email, postal code and country code of the customer.
     *
     * @param email       the customer's email address.
     * @param postalCode  the postal code of the customer.
     * @param countryCode the country code of the customer.
     */
    public CustomerDetails(String email, String postalCode, String countryCode) {
        this.email = email;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
    }

    /**
     * Email address getter.
     *
     * @return the customer's email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Postal code getter.
     *
     * @return the customer's postal code.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Country code getter.
     *
     * @return the customer's country code getter.
     */
    public String getCountryCode() {
        return countryCode;
    }
}
