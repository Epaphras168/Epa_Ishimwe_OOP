package Stock_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<StockItem> stockItems = new ArrayList<>();

        System.out.println("Welcome to Stock Management System!");

        System.out.print("Enter the number of items you want to add: ");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("\nSelect item type: (1) Electronics (2) Clothing (3) Grocery (4) Furniture (5) Perishable");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter Item ID: ");
            String itemId = scanner.nextLine();
            System.out.print("Enter Item Name: ");
            String itemName = scanner.nextLine();
            System.out.print("Enter Quantity in Stock: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter Price per Unit: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            System.out.print("Enter Category: ");
            String category = scanner.nextLine();
            System.out.print("Enter Supplier: ");
            String supplier = scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Warranty Months: ");
                    int warranty = scanner.nextInt();
                    stockItems.add(new ElectronicItem(itemId, itemName, quantity, price, category, supplier, warranty));
                    break;
                case 2:
                    System.out.print("Enter Size: ");
                    String size = scanner.nextLine();
                    System.out.print("Enter Color: ");
                    String color = scanner.nextLine();
                    stockItems.add(new ClothingItem(itemId, itemName, quantity, price, category, supplier, size, color));
                    break;
                case 3:
                    stockItems.add(new GroceryItem(itemId, itemName, quantity, price, category, supplier));
                    break;
                case 4:
                    System.out.print("Enter Weight (kg): ");
                    double weight = scanner.nextDouble();
                    stockItems.add(new FurnitureItem(itemId, itemName, quantity, price, category, supplier, weight));
                    break;
                case 5:
                    System.out.print("Enter Shelf Life: ");
                    String shelfLife = scanner.nextLine();
                    stockItems.add(new PerishableItem(itemId, itemName, quantity, price, category, supplier, shelfLife));
                    break;
                default:
                    System.out.println("Invalid choice!");
                    i--; // redo current iteration
            }
        }

        System.out.println("\n----- Generating Stock Reports -----");
        for (StockItem item : stockItems) {
            item.generateStockReport();
            item.validateStock();
        }

        scanner.close();
    }
}
