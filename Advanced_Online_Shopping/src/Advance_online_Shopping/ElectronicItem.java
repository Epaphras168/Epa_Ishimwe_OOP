package Advance_online_Shopping;

// Concrete class for Electronics
class ElectronicItem extends ShoppingItem {
    private String warrantyInfo;

    public ElectronicItem(String itemId, String itemName, String itemDescription, double price, int stockAvailable, String warrantyInfo) {
        super(itemId, itemName, itemDescription, price, stockAvailable);
        this.warrantyInfo = warrantyInfo;
    }
//Method to update the stock quantity
    public void updateStock(int quantity) {
        stockAvailable -= quantity;
    }



    //Shopping Cart
    public void addToCart(Customer customer) {
        if (stockAvailable > 0) {
            System.out.println(itemName + " added to cart.");
        } else {
            System.out.println("Item out of stock.");
        }
    }
    //Invoice Generation
    public void generateInvoice(Customer customer) {
        System.out.println("Invoice for " + itemName + ": $" + price);
    }

   //checking if we have stock
    public void validateItem() {
        if (stockAvailable <= 0) {
            System.out.println("Electronics out of stock.");
        }
    }
}
