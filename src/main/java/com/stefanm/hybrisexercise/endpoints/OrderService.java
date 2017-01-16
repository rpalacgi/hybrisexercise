package com.stefanm.hybrisexercise.endpoints;

import com.stefanm.hybrisexercise.data.*;
import com.stefanm.hybrisexercise.data.Currency;
import com.stefanm.hybrisexercise.endpoints.orderhistory.OrderHistoryRequest;
import com.stefanm.hybrisexercise.endpoints.orderhistory.OrderHistoryResponse;
import com.stefanm.hybrisexercise.endpoints.placeorder.PlaceOrderRequest;
import com.stefanm.hybrisexercise.endpoints.placeorder.PlaceOrderResponse;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Stefan on 15-Jan-17.
 */
public class OrderService {

    // the order counter used for generating order IDs
    private static Integer ORDER_COUNTER = 0;
    // the orders currently stored in the system
    private static final List<Order> orders = Collections.synchronizedList(new LinkedList<>());

    /**
     * Places an order in the system.
     *
     * @param request the place order request.
     * @return place order response indicating success of the order placement.
     */
    public static PlaceOrderResponse placeOrder(PlaceOrderRequest request) {

        final int orderID;

        // we increase the order counter and assign it to the local variable for placing the order
        synchronized (ORDER_COUNTER) {
            orderID = ++ORDER_COUNTER;
        }

        final Currency currency = Currency.valueOf(request.getCurrency());
        final Order order = new Order(orderID, currency);

        if (request.getItems() != null) {
            for (PlaceOrderRequest.LineItemRequest item : request.getItems()) {
                order.addLineItem(new LineItem(item.getProductID(), item.getQuantity(), item.getPrice()));
            }
        }

        final CustomerDetails customerDetails = new CustomerDetails(request.getEmail(), request.getPostalCode(), request.getCountryCode());
        order.setCustomerDetails(customerDetails);

        synchronized (orders) {
            orders.add(order);
        }

        return new PlaceOrderResponse(order.getOrderID(), order.getOrderDate(), order.getTotalCost());
    }

    /**
     * Retrieves an order history for the customer.
     *
     * @param request the order history request.
     * @return the order history response.
     */
    public static OrderHistoryResponse retrieveHistory(OrderHistoryRequest request) {

        final List<Order> orderHistory = new LinkedList<>();

        if (request.getEmail() != null) {
            synchronized (orders) {
                orderHistory.addAll(orders.stream().filter(order -> order.getCustomerDetails().getEmail().equals(request.getEmail())).filter(order -> request.getOrderStatusFilter() == null ||
                        order.getOrderStatus().equals(OrderStatus.valueOf(request.getOrderStatusFilter()))).collect(Collectors.toList()));
            }
        }

        final OrderHistoryResponse response = new OrderHistoryResponse();

        for (Order order : orderHistory) {
            response.getOrders().add(order);
        }

        return response;
    }
}