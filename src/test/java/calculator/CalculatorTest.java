package calculator;


import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private static Calculator calculator;
    public static final double DELTA = 0.00000000001;

    @BeforeClass
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void PowerTwoNumbers_PositiveBase_PositiveExponent_Test() {
        assertEquals(125, calculator.powerTwoNumbers(5,3), 0);
    }

    @Test
    public void PowerTwoNumbers_PositiveBase_NegativeExponent_Test() {
        assertEquals(0.008, calculator.powerTwoNumbers(5,-3), 0);
    }

    @Test
    public void PowerTwoNumbers_NegativeBase_PositiveExponent_Test() {
        assertEquals(-125, calculator.powerTwoNumbers(-5,3), 0);
    }

    @Test
    public void PowerTwoNumbers_NegativeBase_NegativeExponent_Test() {
        assertEquals(-0.008, calculator.powerTwoNumbers(-5,-3), 0);
    }

    @Test
    public void PowerTwoNumbers_PositiveInfinityBase_PositiveExponent_Test() {
        assertEquals(Double.POSITIVE_INFINITY, calculator.powerTwoNumbers(Double.POSITIVE_INFINITY, 2), 0);
    }

    @Test
    public void PowerTwoNumbers_PositiveInfinityBase_NegativeExponent_Test() {
        assertEquals(0, calculator.powerTwoNumbers(Double.POSITIVE_INFINITY, -2), 0);
    }

    @Test
    public void PowerTwoNumbers_NegativeInfinityBase_PositiveExponent_Test() {
        assertEquals(Double.POSITIVE_INFINITY, calculator.powerTwoNumbers(Double.NEGATIVE_INFINITY, 2), 0);
    }

    @Test
    public void PowerTwoNumbers_NegativeInfinityBase_NegativeExponent_Test() {
        assertEquals(0, calculator.powerTwoNumbers(Double.NEGATIVE_INFINITY, -2), 0);
    }

    @Test
    public void PowerTwoNumbers_NaNBase_Test() {
        assertEquals(Double.NaN, calculator.powerTwoNumbers(Double.NaN, 2), 0);
    }

    @Test
    public void PowerTwoNumbers_NaNExponent_Test() {
        assertEquals(Double.NaN, calculator.powerTwoNumbers(2, Double.NaN), 0);
    }

    @Test
    public void PowerTwoNumbers_Overflow_Test() {
        assertEquals(Double.POSITIVE_INFINITY, calculator.powerTwoNumbers(10, 1000), 0);
    }

    @Test
    public void PowerTwoNumbers_Underflow_Test() {
        assertEquals(0, calculator.powerTwoNumbers(10, -1000), 0);
    }

    @Test
    public void Sqrt_PositiveInput_Test() {
        assertEquals(1.41421356237, calculator.sqrt(2), DELTA);
    }
}
