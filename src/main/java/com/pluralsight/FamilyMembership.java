package com.pluralsight;

import java.math.BigDecimal;

public class FamilyMembership extends Membership {
    private int members;

    public FamilyMembership(String name, BigDecimal baseRate, int membershipMonths, int members) {
        super(name, baseRate, membershipMonths);
        this.members = members;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }
    public BigDecimal getMonthlyPrice() {
        return getMonthlyPrice();
    }
}
