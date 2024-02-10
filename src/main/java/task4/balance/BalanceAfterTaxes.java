package task4.balance;

public class BalanceAfterTaxes extends BalanceStorage implements Calculatable {
    @Override
    public void newBalance(double decrease) {
        this.balance = super.balance - decrease;
    }
}
