package Advance_online_Shopping;

// Concrete class for Clothing
class ClothingItem extends ShoppingItem {
    private String size;

    public ClothingItem(String itemId, String itemName, String itemDescription, double price, int stockAvailable, String size) {
        super(itemId, itemName, itemDescription, price, stockAvailable);
        this.size = size;
    }

    public void updateStock(int quantity) {
        stockAvailable -= quantity;
    }

    public void addToCart(Customer customer) {
        if (stockAvailable > 0) {
            System.out.println(itemName + " (Size: " + size + ") added to cart.");
        } else {
            System.out.println("Item out of stock.");
        }
    }

    public void generateInvoice(Customer customer) {
        System.out.println("Invoice for " + itemName + ": $" + price);
    }

    public void validateItem() {
        if (stockAvailable <= 0) {
            System.out.println("Clothing item out of stock.");
        }
    }
}
