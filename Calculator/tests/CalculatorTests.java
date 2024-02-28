import com.miguelvela.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {
    @Test
    public void sum_1_1_returns_2() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double sumResult = calculator.sum(1,1);

        // Assert
        double expectedValue = 2;
        assertEquals(expectedValue, sumResult);
    }
}
