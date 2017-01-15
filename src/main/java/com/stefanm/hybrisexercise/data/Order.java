package com.stefanm.hybrisexercise.data;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Stefan on 15-Jan-17.
 */
public class Order {

    private int orderID;
    private Date orderDate;

    private Currency orderCurrency;
    private OrderStatus orderStatus;

    private CustomerDetails customerDetails;

    private List<LineItem> orderItems;
    private double totalCost;

    public Order(int orderID, Currency orderCurrency) {

        this.orderID = orderID;
        this.orderCurrency = orderCurrency;

        // we set current date at the time of the order creation
        this.orderDate = new Date();

        // when order is created, its default status is set to OPEN
        this.orderStatus = OrderStatus.OPEN;

        // an empty list created for a new order
        this.orderItems = new LinkedList<LineItem>();
        this.totalCost = 0;
    }

    /**
     * Order ID getter.
     *
     * @return the order ID.
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * Order date getter.
     *
     * @return the date of the order.
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Order currency getter.
     *
     * @return the currency of the order.
     */
    public Currency getOrderCurrency() {
        return orderCurrency;
    }

    /**
     * Order status getter.
     *
     * @return the status of the order.
     */
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Order status setter.
     *
     * @param orderStatus new status of the order.
     */
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * Customer details getter.
     *
     * @return customer details of the order.
     */
    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    /**
     * Customer details setter.
     *
     * @param customerDetails new customer details of the order.
     */
    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    /**
     * Adds new line item to the order.
     *
     * @param lineItem a new line item to add.
     */
    public void addLineItem(LineItem lineItem) {

        // add the new line item to order items list
        this.orderItems.add(lineItem);
        // update the total cost of the order
        this.totalCost += (lineItem.getQuantity() * lineItem.getPrice());
    }

    /**
     * Returns an unmodifiable list of order items.
     *
     * @return the unmodifiable list of order items.
     */
    public List<LineItem> getOrderItems() {
        return Collections.unmodifiableList(orderItems);
    }

    /**
     * Returns the current total cost of the order.
     *
     * @return the total cost of the order.
     */
    public double getTotalCost() {
        return totalCost;
    }
}