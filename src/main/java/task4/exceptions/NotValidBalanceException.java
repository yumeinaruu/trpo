package task4.exceptions;

public class NotValidBalanceException extends RuntimeException {
    @Override
    public String toString() {
        return "Positive number expected";
    }
}
