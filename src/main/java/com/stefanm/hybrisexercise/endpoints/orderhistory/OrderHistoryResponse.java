package com.stefanm.hybrisexercise.endpoints.orderhistory;

import com.stefanm.hybrisexercise.data.Order;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Stefan on 15-Jan-17.
 */
public class OrderHistoryResponse {

    private String errorMessage;
    private List<Order> orders = new LinkedList<Order>();

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
