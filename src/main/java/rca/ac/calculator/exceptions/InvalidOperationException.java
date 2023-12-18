package rca.ac.calculator.exceptions;
import java.lang.Exception;
public class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}