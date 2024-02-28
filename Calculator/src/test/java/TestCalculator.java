import com.miguelvela.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    @Test
    public void test_sum_1_1_returns_2() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double sumResult = calculator.sum(1,1);

        // Assert
        double expectedValue = 2;
        assertEquals(expectedValue, sumResult);
    }

    @Test
    public void test_sub_3_2_returns_1() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double sumResult = calculator.sub(3,2);

        // Assert
        double expectedValue = 1;
        assertEquals(expectedValue, sumResult);
    }

    @Test
    public void test_div_6_2_returns_3() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double sumResult = calculator.divide(6,2);

        // Assert
        double expectedValue = 3;
        assertEquals(expectedValue, sumResult);
    }

    @Test
    public void test_div_5_2_returns_decimalValue() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double sumResult = calculator.divide(5,2);

        // Assert
        double expectedValue = 2.5d;
        assertEquals(expectedValue, sumResult);
    }

    @Test
    public void test_multiply_3_4_returns_12() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double sumResult = calculator.multiply(3,4);

        // Assert
        double expectedValue = 12;
        assertEquals(expectedValue, sumResult);
    }
}
