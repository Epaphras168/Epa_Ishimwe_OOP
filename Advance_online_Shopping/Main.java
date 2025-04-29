package Advance_online_Shopping;

import java.util.Scanner;
import java.util.UUID;

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capture customer information
        System.out.print("Enter Customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();

        Customer customer = new Customer(customerId, customerName, email, address, phone);
        ShoppingCart cart = new ShoppingCart(UUID.randomUUID().toString(), customer);

        // Create some items manually (in real app, these would be fetched from database)
        ElectronicItem laptop = new ElectronicItem("E1", "Laptop", "Gaming Laptop", 1500.0, 10, "2 Years Warranty");
        ClothingItem tshirt = new ClothingItem("C1", "T-Shirt", "Cotton T-shirt", 20.0, 50, "M");
        BooksItem book = new BooksItem("B1", "Java Programming", "Learn Java easily", 30.0, 100, "1234567890");

        // Simple menu
        System.out.println("\nAvailable Products:");
        System.out.println("1. Laptop");
        System.out.println("2. T-Shirt");
        System.out.println("3. Java Book");
        System.out.print("Choose a product to add to cart (1-3): ");
        int choice = scanner.nextInt();

        // Add selected item to cart
        if (choice == 1) {
            laptop.addToCart(customer);
            cart.addItem(laptop);
        } else if (choice == 2) {
            tshirt.addToCart(customer);
            cart.addItem(tshirt);
        } else if (choice == 3) {
            book.addToCart(customer);
            cart.addItem(book);
        } else {
            System.out.println("Invalid choice!");
        }

        // Display cart and proceed to payment
        System.out.println("\n--- Cart Summary ---");
        cart.displayCart();

        // Payment
        scanner.nextLine(); // consume leftover newline
        System.out.print("\nEnter Payment Method (Credit Card/PayPal): ");
        String method = scanner.nextLine();

        Payment payment = new Payment(UUID.randomUUID().toString(), method, cart.getTotalPrice());

        System.out.println("\n--- Payment Details ---");
        payment.displayPayment();
    }
}
