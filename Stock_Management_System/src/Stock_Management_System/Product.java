package Stock_Management_System;

// Product Class using Encapsulation
class Product {
    private String productId;
    private String productName;
    private String brand;
    private String supplier;
    private int stockQuantity;

    public Product(String productId, String productName, String brand, String supplier, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.brand = brand;
        this.supplier = supplier;
        this.stockQuantity = stockQuantity;
    }

    // Getter methods
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getBrand() {
        return brand;
    }

    public String getSupplier() {
        return supplier;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    // Method to validate product
    public void validateProduct() {
        if (productName.isEmpty() || stockQuantity < 0 || brand.isEmpty()) {
            System.out.println("Invalid product details!");
        }
    }
}