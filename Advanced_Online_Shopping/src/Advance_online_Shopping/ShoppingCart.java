package Advance_online_Shopping;

import java.util.ArrayList;

// Encapsulation - ShoppingCart class
class ShoppingCart {
    private String cartId;
    private ArrayList<ShoppingItem> cartItems;
    private double totalPrice;
    private Customer customer;

    // Constructor
    public ShoppingCart(String cartId, Customer customer) {
        this.cartId = cartId;
        this.customer = customer;
        this.cartItems = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    // Method to add item to cart
    public void addItem(ShoppingItem item) {
        cartItems.add(item);
        totalPrice += item.price;
        item.updateStock(1);
    }

    // Display cart details
    public void displayCart() {
        System.out.println("Cart for " + customer.getCustomerName());
        for (ShoppingItem item : cartItems) {
            System.out.println(item.itemName + " - $" + item.price);
        }
        System.out.println("Total: $" + totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}