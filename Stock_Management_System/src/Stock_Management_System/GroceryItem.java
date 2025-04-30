package Stock_Management_System;

// GroceryItem class
class GroceryItem extends StockItem {

    public GroceryItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String category, String supplier) {
        super(itemId, itemName, quantityInStock, pricePerUnit, category, supplier);
    }

    @Override
    void updateStock(int quantity) {
        quantityInStock += quantity;
    }

    @Override
    double calculateStockValue() {
        return quantityInStock * pricePerUnit;
    }

    @Override
    void generateStockReport() {
        System.out.println("Grocery Stock Report for " + itemName);
        System.out.println("Stock Value: " + calculateStockValue());
    }

    @Override
    void validateStock() {
        if (quantityInStock <= 0) {
            System.out.println("Item is out of stock!");
        }
    }
}
