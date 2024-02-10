package task4.user;

import task4.balance.Calculatable;

public class UserTaxesSum extends UserInfo implements TaxesSum {
    @Override
    public double taxSum(User user) {
        return user.mainJobTax + user.extraJobTax + user.rewardTax + user.propertySaleTax
                + user.giftTax + user.foreignTransactionTax + user.childrenTax;
    }
}
