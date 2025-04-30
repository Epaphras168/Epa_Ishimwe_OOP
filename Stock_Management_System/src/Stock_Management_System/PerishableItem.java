package Stock_Management_System;

// PerishableItem class
class PerishableItem extends StockItem {
    String shelfLife;

    public PerishableItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String category, String supplier, String shelfLife) {
        super(itemId, itemName, quantityInStock, pricePerUnit, category, supplier);
        this.shelfLife = shelfLife;
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
        System.out.println("Perishable Stock Report for " + itemName);
        System.out.println("Shelf Life: " + shelfLife);
        System.out.println("Stock Value: " + calculateStockValue());
    }

    @Override
    void validateStock() {
        if (quantityInStock <= 0) {
            System.out.println("Item expired or needs to be disposed!");
        }
    }
}
