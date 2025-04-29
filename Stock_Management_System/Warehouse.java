package Stock_Management_System;

// Warehouse class using Encapsulation
class Warehouse {
    private String warehouseId;
    private String location;
    private int capacity;
    private String managerName;

    public Warehouse(String warehouseId, String location, int capacity, String managerName) {
        this.warehouseId = warehouseId;
        this.location = location;
        this.capacity = capacity;
        this.managerName = managerName;
    }

    public void displayWarehouseInfo() {
        System.out.println("Warehouse ID: " + warehouseId);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity);
        System.out.println("Manager: " + managerName);
    }
}
