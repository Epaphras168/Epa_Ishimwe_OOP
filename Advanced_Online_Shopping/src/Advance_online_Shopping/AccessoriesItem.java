package Advance_online_Shopping;

// Concrete class for Accessories
class AccessoriesItem extends ShoppingItem {
    private double rating;

    public AccessoriesItem(String itemId, String itemName, String itemDescription, double price, int stockAvailable, double rating) {
        super(itemId, itemName, itemDescription, price, stockAvailable);
        this.rating = rating;
    }

    public void updateStock(int quantity) {
        stockAvailable -= quantity;
    }

    public void addToCart(Customer customer) {
        if (stockAvailable > 0) {
            System.out.println(itemName + " added to cart. (Rating: " + rating + "/5)");
        } else {
            System.out.println("Item out of stock.");
        }
    }

    public void generateInvoice(Customer customer) {
        System.out.println("Invoice for " + itemName + ": $" + price);
    }

    public void validateItem() {
        if (stockAvailable <= 0) {
            System.out.println("Accessory out of stock.");
        }
    }
}
