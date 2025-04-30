package Advanced_Motor_Vehicle_Insurance_System;

import java.time.LocalDate;

public class Claim {
    private String claimId;
    private double claimAmount;
    private LocalDate claimDate;
    private String status;

    public Claim(String claimId, double claimAmount, LocalDate claimDate) {
        this.claimId = claimId;
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.status = "Pending";
    }

    public void approve(double coverage) {
        if (claimAmount <= coverage) {
            status = "Approved";
        } else {
            status = "Rejected: Exceeds coverage.";
        }
    }

    public String getStatus() { return status; }
    public double getAmount() { return claimAmount; }
}
