package com.pluralsight;

import java.math.BigDecimal;

public class PremiumMembership extends Membership {
    private int guessPasses;

    public PremiumMembership(String name, BigDecimal baseRate, int membershipMonths, int guessPasses) {
        super(name, baseRate, membershipMonths);
        this.guessPasses = guessPasses;
    }

    public int getGuessPasses() {
        return guessPasses;
    }

    public void setGuessPasses(int guessPasses) {
        this.guessPasses = guessPasses;
    }
    public BigDecimal getMonthlyPrice(){
        return getBaseRate().add(new BigDecimal("18.50"));
    }
    public void useGuestPass(){
        if (guessPasses > 0) {
           guessPasses = guessPasses - 1;
            System.out.println(getName() + "has " + getGuessPasses() + " remaining.");

        } else {
            System.out.println(getName() + " has no remaining guest passes left.");
        }
    }
    public BigDecimal getSignUpFee(){
        if (getMembershipMonths() >= 12) {
            return new BigDecimal("0.00");

        } return new BigDecimal("49.00");
    }
}
