package Advanced_Motor_Vehicle_Insurance_System;

public class Vehicle {
    private String vehicleId;
    private String make;
    private String model;
    private int year;
    private String type;

    public Vehicle(String vehicleId, String make, String model, int year, String type) {
        if (year < 1990 || year > java.time.LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Invalid vehicle year.");
        }
        this.vehicleId = vehicleId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.type = type;
    }

    public int getYear() { return year; }
    public String getType() { return type; }
    public String getVehicleId() { return vehicleId; }

    public void updateDetails(String make, String model, int year, String type) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.type = type;
    }
}
