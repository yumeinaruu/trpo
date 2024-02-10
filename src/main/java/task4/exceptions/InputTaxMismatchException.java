package task4.exceptions;

public class InputTaxMismatchException extends RuntimeException {
    @Override
    public String toString() {
        return "Tax or balance input mismatch";
    }
}
