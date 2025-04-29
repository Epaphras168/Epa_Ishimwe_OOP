package Stock_Management_System;

// ElectronicsItem class
class ElectronicItem extends StockItem {
    int warrantyMonths;

    public ElectronicItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String category, String supplier, int warrantyMonths) {
        super(itemId, itemName, quantityInStock, pricePerUnit, category, supplier);
        this.warrantyMonths = warrantyMonths;
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
        System.out.println("Electronics Stock Report for " + itemName);
        System.out.println("Warranty Period: " + warrantyMonths + " months");
        System.out.println("Stock Value: " + calculateStockValue());
    }

    @Override
    void validateStock() {
        if (quantityInStock <= 0) {
            System.out.println("Stock not available for sale!");
        }
    }

    public void applyDiscount(double discountPercent) {
        if (discountPercent <= 50) {
            pricePerUnit -= pricePerUnit * (discountPercent / 100);
            System.out.println("Discount applied. New price: " + pricePerUnit);
        } else {
            System.out.println("Discount cannot exceed 50%!");
        }
    }
}
