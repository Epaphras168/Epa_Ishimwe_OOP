package Stock_Management_System;

// FurnitureItem class
class FurnitureItem extends StockItem {
    double weight;

    public FurnitureItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String category, String supplier, double weight) {
        super(itemId, itemName, quantityInStock, pricePerUnit, category, supplier);
        this.weight = weight;
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
        System.out.println("Furniture Stock Report for " + itemName);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Stock Value: " + calculateStockValue());
    }

    @Override
    void validateStock() {
        if (quantityInStock <= 0) {
            System.out.println("Out of stock, cannot deliver!");
        }
    }
}
