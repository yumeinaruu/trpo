package task4.balance;

import task4.exceptions.InputTaxMismatchException;

public class BalanceAfterTaxes extends BalanceStorage implements Calculatable {
    @Override
    public void newBalance(double decrease) {
        try {
            if (this.balance > decrease) {
                this.balance = super.balance - decrease;
            } else {
                throw new InputTaxMismatchException();
            }
        } catch (InputTaxMismatchException e) {
            System.out.println(e);
        }
    }
}
