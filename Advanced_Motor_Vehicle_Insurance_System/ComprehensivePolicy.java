package Advanced_Motor_Vehicle_Insurance_System;

import java.time.LocalDate;

public class ComprehensivePolicy extends InsurancePolicy {
    public ComprehensivePolicy(String policyId, Vehicle vehicle, Person holder, double coverageAmount,
                               LocalDate startDate, LocalDate endDate) {
        super(policyId, vehicle, holder, coverageAmount, startDate, endDate);
        validatePolicy();
        calculatePremium();
    }

    public void calculatePremium() {
        int vehicleAge = LocalDate.now().getYear() - vehicle.getYear();
        premiumAmount = 500 + (vehicleAge * 50);
    }

    public void processClaim(double amount) {
        Claim claim = new Claim("CMP" + System.currentTimeMillis(), amount, LocalDate.now());
        claim.approve(coverageAmount);
        System.out.println("Claim Status: " + claim.getStatus());
    }

    public void validatePolicy() {
        if (!vehicle.getType().equalsIgnoreCase("car") && !vehicle.getType().equalsIgnoreCase("suv")) {
            throw new IllegalArgumentException("ComprehensivePolicy only valid for cars and SUVs.");
        }
    }

    public void generatePolicyReport() {
        System.out.println("=== Comprehensive Policy Report ===");
        System.out.println("Policy ID: " + policyId);
        System.out.println("Holder: " + holder.getFullName());
        System.out.println("Vehicle ID: " + vehicle.getVehicleId());
        System.out.println("Premium: " + premiumAmount);
        System.out.println("Coverage: " + coverageAmount);
    }
}

