package Advanced_Motor_Vehicle_Insurance_System;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        // Create Person
        System.out.println("Enter your details:");
        System.out.print("Full Name: ");
        String name = scann.nextLine();
        System.out.print("DOB (YYYY-MM-DD): ");
        LocalDate dob = LocalDate.parse(scann.nextLine());
        System.out.print("Email: ");
        String email = scann.nextLine();
        System.out.print("Phone: ");
        String phone = scann.nextLine();
        Person person = new Person("P1", name, dob, email, phone);

        // Create Vehicle
        System.out.println("Enter vehicle details:");
        System.out.print("Make: ");
        String make = scann.nextLine();
        System.out.print("Model: ");
        String model = scann.nextLine();
        System.out.print("Year: ");
        int year = Integer.parseInt(scann.nextLine());
        System.out.print("Type (car/suv/motorcycle): ");
        String type = scann.nextLine();
        Vehicle vehicle = new Vehicle("V1", make, model, year, type);

        // Create Policy
        LocalDate start = LocalDate.now();
        LocalDate end = start.plusYears(1);
        ComprehensivePolicy policy = new ComprehensivePolicy("C001", vehicle, person, 5000.0, start, end);

        // Displaying the report
        policy.generatePolicyReport();

        // Process Claim
        System.out.print("Enter claim amount: ");
        double claimAmount = scann.nextDouble();
        policy.processClaim(claimAmount);
    }
}

