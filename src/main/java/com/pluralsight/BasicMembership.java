package com.pluralsight;

import java.math.BigDecimal;

public class BasicMembership extends Membership {
    private boolean isOffPeakHours;

    public BasicMembership(int membershipMonths, String name, BigDecimal baseRate, boolean isOffPeakHours) {
        super(name, baseRate, membershipMonths);
        this.isOffPeakHours = isOffPeakHours;
    }

    public boolean isOffPeakHours() {
        return isOffPeakHours;
    }

    public void setOffPeakHours(boolean offPeakHours) {
        isOffPeakHours = offPeakHours;
    }
    public BigDecimal getMonthlyPrice(){
        if (isOffPeakHours()){
            return getBaseRate().subtract(new BigDecimal("5.00"));
        }
        return getBaseRate();
    }
}
