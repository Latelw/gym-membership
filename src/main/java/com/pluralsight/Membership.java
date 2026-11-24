package com.pluralsight;

import java.math.BigDecimal;

public class Membership {
    private String name;
    private BigDecimal baseRate;
    private int membershipMonths;

    public Membership(int membershipMonths, String name, BigDecimal baseRate) {
        this.membershipMonths = membershipMonths;
        this.name = name;
        this.baseRate = baseRate;
    }

    public int getMembershipMonths() {
        return membershipMonths;
    }

    public void setMembershipMonths(int membershipMonths) {
        this.membershipMonths = membershipMonths;
    }

    public BigDecimal getBaseRate() {
        return baseRate;
    }

    public void setPrice(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getMonthlyPrice(){
        return baseRate;

    }
}
