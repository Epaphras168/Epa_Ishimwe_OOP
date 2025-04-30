package Advance_online_Shopping;

// Concrete class for Books
class BooksItem extends ShoppingItem {
    private String ISBN;

    public BooksItem(String itemId, String itemName, String itemDescription, double price, int stockAvailable, String ISBN) {
        super(itemId, itemName, itemDescription, price, stockAvailable);
        this.ISBN = ISBN;
    }

    public void updateStock(int quantity) {
        stockAvailable -= quantity;
    }

    public void addToCart(Customer customer) {
        if (stockAvailable > 0) {
            System.out.println(itemName + " (ISBN: " + ISBN + ") added to cart.");
        } else {
            System.out.println("Item out of stock.");
        }
    }

    public void generateInvoice(Customer customer) {
        System.out.println("Invoice for " + itemName + ": $" + price);
    }

    public void validateItem() {
        if (stockAvailable <= 0) {
            System.out.println("Book not available.");
        }
    }
}
