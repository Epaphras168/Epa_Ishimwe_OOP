package Advanced_Motor_Vehicle_Insurance_System;

import java.time.LocalDate; //So I can use the date features

public abstract class InsurancePolicy {
    public String policyId;
    public Vehicle vehicle;
    public Person holder;
    public double coverageAmount;
    public double premiumAmount;
    public LocalDate startDate;
    public LocalDate endDate;

    public InsurancePolicy(String policyId, Vehicle vehicle, Person holder, double coverageAmount, LocalDate startDate, LocalDate endDate) {
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




    //getters and setters


    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }
}
