package com.stefanm.hybrisexercise.endpoints.orderhistory;

/**
 * Created by Stefan on 15-Jan-17.
 */
public class OrderHistoryRequest {

    private String email;
    private String orderByDate;
    private String orderStatusFilter;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrderByDate() {
        return orderByDate;
    }

    public void setOrderByDate(String orderByDate) {
        this.orderByDate = orderByDate;
    }

    public String getOrderStatusFilter() {
        return orderStatusFilter;
    }

    public void setOrderStatusFilter(String orderStatusFilter) {
        this.orderStatusFilter = orderStatusFilter;
    }
}
