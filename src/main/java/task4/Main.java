package task4;

import task4.balance.BalanceAfterTaxes;
import task4.exceptions.NotValidBalanceException;
import task4.user.User;
import task4.user.UserTaxesSum;
import task7.CreateDB;
import task7.JDBCConnection;
import task7.JDBCStatement;
import task7.JDBCUpdate;

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
        UserTaxesSum userTaxesSum = new UserTaxesSum();
        System.out.println("Input person's balance: ");
        balance.setBalance(scanner.nextDouble(), userTaxesSum.taxSum(user));
        //HashMap<String, Double> userBalance = new HashMap<>();
        // userBalance.put(user.getName(), balance.getBalance());
        // System.out.println("Information about user before taxes: " + userBalance);

        balance.newBalance(userTaxesSum.taxSum(user));

        // userBalance.put(user.getName(), balance.getBalance());
        //System.out.println("Information about user after taxes: " + userBalance);

        JDBCStatement statement = new JDBCStatement();
        CreateDB.createDB(new JDBCConnection().findAll());
        statement.setStatement(new JDBCConnection().findAll(), user.getName(), balance.getBalance());
        statement.getStatement(new JDBCConnection().findAll());
        JDBCUpdate.updateStatement(new JDBCConnection().findAll());
        statement.getStatement(new JDBCConnection().findAll());
    }
}
