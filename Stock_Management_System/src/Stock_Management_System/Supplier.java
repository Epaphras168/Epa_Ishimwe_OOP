package Stock_Management_System;

// Supplier class using Encapsulation
class Supplier {
    private String supplierId;
    private String companyName;
    private String contactPerson;
    private String phone;
    private String email;

    public Supplier(String supplierId, String companyName, String contactPerson, String phone, String email) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.phone = phone;
        this.email = email;
    }

    public void validateSupplier() {
        if (companyName.isEmpty() || phone.length() != 10 || !email.contains("@")) {
            System.out.println("Invalid supplier details!");
        }
    }
}
