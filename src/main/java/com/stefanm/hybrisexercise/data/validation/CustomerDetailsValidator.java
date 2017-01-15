package com.stefanm.hybrisexercise.data.validation;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stefan on 15-Jan-17.
 */
public class CustomerDetailsValidator {

    private Pattern emailPattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    /**
     * Default constructor.
     * Assembles default customer details patterns.
     */
    public CustomerDetailsValidator() {
        emailPattern = Pattern.compile(EMAIL_PATTERN);
    }

    /**
     * Validates the provided email address.
     *
     * @param emailAddress the email address to be validated.
     * @return boolean flag indicating the result of validation.
     */
    public boolean validateEmailAddress(String emailAddress) {
        matcher = emailPattern.matcher(emailAddress);
        return matcher.matches();
    }
}