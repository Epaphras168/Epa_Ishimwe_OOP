package Stock_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

// Abstract class StockItem
abstract class StockItem {
    // Attributes
    String itemId;
    String itemName;
    int quantityInStock;
    double pricePerUnit;
    String category;
    String supplier;

    // Constructor
    public StockItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String category, String supplier) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantityInStock = quantityInStock;
        this.pricePerUnit = pricePerUnit;
        this.category = category;
        this.supplier = supplier;
    }

    // Abstract methods
    abstract void updateStock(int quantity);
    abstract double calculateStockValue();
    abstract void generateStockReport();
    abstract void validateStock();
}
