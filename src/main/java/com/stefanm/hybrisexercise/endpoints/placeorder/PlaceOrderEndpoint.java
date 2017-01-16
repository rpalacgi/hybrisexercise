package com.stefanm.hybrisexercise.endpoints.placeorder;

import com.stefanm.hybrisexercise.data.LineItem;
import com.stefanm.hybrisexercise.endpoints.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Stefan on 15-Jan-17.
 */

@Controller
@RequestMapping("/place-order")
public class PlaceOrderEndpoint {

    // the order service holding the orders
    private OrderService orderService = new OrderService();

    @RequestMapping(method = RequestMethod.POST)
    public
    @ResponseBody
    PlaceOrderResponse placeOrder(PlaceOrderRequest request) {

        if (request == null) {

            return new PlaceOrderResponse("You must supply an order request.");
        } else {

            return orderService.placeOrder(request);
        }
    }
}