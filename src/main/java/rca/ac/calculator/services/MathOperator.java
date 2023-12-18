package rca.ac.calculator.services;

import rca.ac.calculator.exceptions.InvalidOperationException;

public interface MathOperator {
        double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}
