package rca.ac.calculator.services;

import org.junit.runner.RunWith;import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import rca.ac.calculator.exceptions.InvalidOperationException;
import rca.ac.calculator.services.impl.MathOperatorImpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathServicesTest {
    @InjectMocks
    private MathOperatorImpl mathOperatorService;

    @Test
    public void should_create_math_operation_success() throws InvalidOperationException {
        double operator1 = 4;
        double operator2 = 9;
        String operation = "+";

        double mathOperation = mathOperatorService.doMath(operator1,operator2, operation);
        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(mathOperation);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(mathOperation).usingRecursiveComparison().isEqualTo(actualMathOperator);
    }

}
