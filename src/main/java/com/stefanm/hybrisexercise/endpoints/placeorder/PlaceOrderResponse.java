package com.stefanm.hybrisexercise.endpoints.placeorder;

import java.util.Date;

/**
 * Created by Stefan on 15-Jan-17.
 */
public class PlaceOrderResponse {

    private String errorMessage;

    private int orderID;
    private Date orderDate;
    private double totalCost;

    public PlaceOrderResponse() {
    }

    /**
     * Response constructor with a custom error.
     *
     * @param errorResponse
     */
    public PlaceOrderResponse(String errorResponse) {
        this.errorMessage = errorResponse;
    }

    /**
     * Default response constructor.
     *
     * @param orderID   the order ID.
     * @param orderDate the order date.
     * @param totalCost the order total price.
     */
    public PlaceOrderResponse(int orderID, Date orderDate, double totalCost) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.totalCost = totalCost;
    }

    /**
     * The order ID getter.
     *
     * @return the order ID.
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * The order date getter.
     *
     * @return the order date.
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * The order total cost getter.
     *
     * @return the total cost of the order.
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * Error message getter.
     *
     * @return the error message.
     */
    public String getErrorMessage() {
        return errorMessage;
    }
}