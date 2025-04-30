package Advance_online_Shopping;

// Encapsulation - Customer class
class Customer {
    private String customerId;
    private String customerName;
    private String email;
    private String address;
    private String phone;

    // Constructor
    public Customer(String customerId, String customerName, String email, String address, String phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    // Getter methods
    public String getCustomerId() { return customerId; }
    public String getCustomerName() { return customerName; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
}
