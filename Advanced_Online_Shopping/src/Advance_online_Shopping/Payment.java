package Advance_online_Shopping;

// Encapsulation - Payment class
class Payment {
    private String paymentId;
    private String paymentMethod;
    private double amountPaid;
//    private Date transactionDate;

    public Payment(String paymentId, String paymentMethod, double amountPaid) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
//        this.transactionDate = new Date(); // current date
    }

    public void displayPayment() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Method: " + paymentMethod);
        System.out.println("Amount: $" + amountPaid);
//        System.out.println("Date: " + transactionDate);
    }
}
