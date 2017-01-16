package com.stefanm.hybrisexercise.endpoints;

import com.stefanm.hybrisexercise.data.LineItem;
import com.stefanm.hybrisexercise.endpoints.OrderService;
import com.stefanm.hybrisexercise.endpoints.orderhistory.OrderHistoryRequest;
import com.stefanm.hybrisexercise.endpoints.orderhistory.OrderHistoryResponse;
import com.stefanm.hybrisexercise.endpoints.placeorder.PlaceOrderRequest;
import com.stefanm.hybrisexercise.endpoints.placeorder.PlaceOrderResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Stefan on 15-Jan-17.
 */

@Controller
public class OrderEndpoint {

    // the order service holding the orders
    private OrderService orderService = new OrderService();

    @RequestMapping(value = "/place-order", method = RequestMethod.POST)
    public
    @ResponseBody
    PlaceOrderResponse placeOrder(PlaceOrderRequest request) {

        if (request == null) {

            return new PlaceOrderResponse("You must supply an order request.");
        } else {

            return orderService.placeOrder(request);
        }
    }

    @RequestMapping(value = "/retrieve-history", method = RequestMethod.POST)
    public
    @ResponseBody
    OrderHistoryResponse retrieveHistory(OrderHistoryRequest request) {

        if (request == null) {

            final OrderHistoryResponse response = new OrderHistoryResponse();
            response.setErrorMessage("You must supply an order history request!");
            return response;
        } else {

            return orderService.retrieveHistory(request);
        }
    }
}