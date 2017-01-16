package com.stefanm.hybrisexercise.endpoints.placeorder;

import com.stefanm.hybrisexercise.data.Currency;
import com.stefanm.hybrisexercise.data.LineItem;
import com.stefanm.hybrisexercise.data.Order;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Stefan on 15-Jan-17.
 */
public class PlaceOrderRequest {

    private String currency;
    private String email;
    private String postalCode;
    private String countryCode;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    private LineItemRequest[] items;

    public LineItemRequest[] getItems() {
        return items;
    }

    public void setItems(LineItemRequest[] items) {
        this.items = items;
    }

    public class LineItemRequest {

        private int productID;
        private int quantity;
        private double price;

        public LineItemRequest() {
        }

        public int getProductID() {
            return productID;
        }

        public void setProductID(int productID) {
            this.productID = productID;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}