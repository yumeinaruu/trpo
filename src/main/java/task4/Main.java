package task4;

import task4.balance.BalanceAfterTaxes;
import task4.user.User;
import task4.user.UserTaxesSum;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User.UserBuilder()
                .name()
                .mainJobTax()
                .extraJobTax()
                .rewardTax()
                .propertySaleTax()
                .giftTax()
                .foreignTransactionTax()
                .childrenTax()
                .build();
        BalanceAfterTaxes balance = new BalanceAfterTaxes();
        System.out.println("Input person's balance: ");
        balance.setBalance(scanner.nextDouble());
        HashMap<String, Double> userBalance = new HashMap<>();
        userBalance.put(user.getName(), balance.getBalance());
        System.out.println("Information about user before taxes: " + userBalance);

        balance.newBalance(new UserTaxesSum().taxSum(user));

        userBalance.put(user.getName(), balance.getBalance());
        System.out.println("Information about user after taxes: " + userBalance);
    }
}
