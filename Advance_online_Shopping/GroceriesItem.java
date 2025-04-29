package Advance_online_Shopping;

// Concrete class for Groceries
class GroceriesItem extends ShoppingItem {
//    private Date expiryDate;

    public GroceriesItem(String itemId, String itemName, String itemDescription, double price, int stockAvailable) {
        super(itemId, itemName, itemDescription, price, stockAvailable);
    }

    public void updateStock(int quantity) {
        stockAvailable -= quantity;
    }

    public void addToCart(Customer customer) {
        if (stockAvailable > 0) {
            System.out.println(itemName + " added to cart.");
        } else {
            System.out.println("Item out of stock.");
        }
    }

    public void generateInvoice(Customer customer) {
        System.out.println("Invoice for " + itemName + ": $" + price);
    }

    public void validateItem() {
//        Date today = new Date();
//        if (expiryDate.before(today)) {
//            System.out.println("Item expired!");
//        }
    }
}
