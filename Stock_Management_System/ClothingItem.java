package Stock_Management_System;

// ClothingItem class
class ClothingItem extends StockItem {
    String size;
    String color;

    public ClothingItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String category, String supplier, String size, String color) {
        super(itemId, itemName, quantityInStock, pricePerUnit, category, supplier);
        this.size = size;
        this.color = color;
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
        System.out.println("Clothing Stock Report for " + itemName);
        System.out.println("Size: " + size + ", Color: " + color);
        System.out.println("Stock Value: " + calculateStockValue());
    }

    @Override
    void validateStock() {
        if (quantityInStock <= 0) {
            System.out.println("Out of Stock!");
        }
    }
}
