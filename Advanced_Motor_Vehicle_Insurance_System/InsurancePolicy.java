package Advanced_Motor_Vehicle_Insurance_System;

import java.time.LocalDate;

public abstract class InsurancePolicy {
    protected String policyId;
    protected Vehicle vehicle;
    protected Person holder;
    protected double coverageAmount;
    protected double premiumAmount;
    protected LocalDate startDate;
    protected LocalDate endDate;

    public InsurancePolicy(String policyId, Vehicle vehicle, Person holder, double coverageAmount,
                           LocalDate startDate, LocalDate endDate) {
        this.policyId = policyId;
        this.vehicle = vehicle;
        this.holder = holder;
        this.coverageAmount = coverageAmount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public abstract void calculatePremium();
    public abstract void processClaim(double amount);
    public abstract void validatePolicy();
    public abstract void generatePolicyReport();
}
