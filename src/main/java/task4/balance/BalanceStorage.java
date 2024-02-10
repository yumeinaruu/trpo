package task4.balance;

import task4.exceptions.InputTaxMismatchException;

public class BalanceStorage {
    protected double balance;

    public void setBalance(double balance, double decrease) {
        try {
            if (balance > decrease) {
                this.balance = balance;
            } else {
                throw new InputTaxMismatchException();
            }
        } catch (InputTaxMismatchException e) {
            System.out.println(e);
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
