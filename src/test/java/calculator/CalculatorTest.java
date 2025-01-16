package calculator;


import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private static Calculator calculator;
    public static final double DELTA = 0.000_000_000_01;

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

    @Test
    public void Sqrt_NegativeInput_Test() {
        assertEquals(Double.NaN, calculator.sqrt(-2), 0);
    }

    @Test
    public void Sqrt_Fraction_Test() {
        assertEquals(0.5, calculator.sqrt(0.25), DELTA);
    }

    @Test
    public void CalculateSquareArea_WholePositiveNumber_Test() {
        assertEquals(16, calculator.CalculateSquareArea(4), 0);
    }

    @Test
    public void CalculateSquareArea_Zero_Test() {
        assertEquals(Double.NaN, calculator.CalculateSquareArea(0), 0);
    }

    @Test
    public void CalculateSquareArea_NegativeNumber_Test() {
        assertEquals(Double.NaN, calculator.CalculateSquareArea(-1), 0);
    }

    @Test
    public void CalculateRectArea_WholePositiveNumber_Test() {
        assertEquals(20, calculator.CalculateRectArea(4, 5), 0);
    }

    @Test
    public void CalculateRectArea_Zero_Test() {
        assertEquals(Double.NaN, calculator.CalculateRectArea(0, 100), 0);
    }

    @Test
    public void CalculateRectArea_NegativeNumber_Test() {
        assertEquals(Double.NaN, calculator.CalculateRectArea(-1, 1), 0);
    }

    @Test
    public void CalculateSquareCirc_PositiveNumber_Test() {
        assertEquals(12, calculator.CalculateSquareCirc(3), 0);
    }

    @Test
    public void CalculateSquareCirc_Zero_Test() {
        assertEquals(Double.NaN, calculator.CalculateSquareCirc(0), 0);
    }

    @Test
    public void CalculateSquareCirc_NegativeNumber_Test() {
        assertEquals(Double.NaN, calculator.CalculateSquareCirc(-1), 0);
    }

    @Test
    public void CalculateRectCirc_PositiveNumber_Test() {
        assertEquals(18, calculator.CalculateRectCirc(3, 6), 0);
    }

    @Test
    public void CalculateRectCirc_Zero_Test() {
        assertEquals(Double.NaN, calculator.CalculateRectCirc(0, 1), 0);
    }

    @Test
    public void CalculateRectCirc_NegativeNumber_Test() {
        assertEquals(Double.NaN, calculator.CalculateRectCirc(-1, 1), 0);
    }

    @Test
    public void CalculateTriangleArea_ValidTriangle_Test() {
        assertEquals(10, calculator.CalculateTriangleArea(4, 5), 0);
    }

    @Test
    public void CalculateTriangleArea_ZeroHeight_Test() {
        assertEquals(Double.NaN, calculator.CalculateTriangleArea(4, 0), 0);
    }

    @Test
    public void CalculateTriangleArea_ZeroLengthSide_Test() {
        assertEquals(Double.NaN, calculator.CalculateTriangleArea(0, 5), 0);
    }

    @Test
    public void CalculateTriangleCirc_ValidTriangle_Test() {
        assertEquals(9, calculator.CalculateTriangleCirc(2, 3, 4), 0);
    }

    @Test
    public void CalculateTriangleCirc_IncorrectSumOfSides_Test() {
        assertEquals(Double.NaN, calculator.CalculateTriangleCirc(1, 2, 3), 0);
    }
}
