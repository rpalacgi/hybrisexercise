package com.stefanm.hybrisexercise.data;

/**
 * Created by Stefan on 15-Jan-17.
 */
public class LineItem {

    private int productID;
    private int quantity;
    private double price;

    /**
     * Default constructor, setting up the productID, quantity, and price.
     */
    public LineItem(int productID, int quantity, double price) {
        this.productID = productID;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * Product ID getter.
     *
     * @return the line item's product ID.
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Quantity getter.
     *
     * @return the line item's product quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Price getter.
     *
     * @return the line item's product price getter.
     */
    public double getPrice() {
        return price;
    }
}