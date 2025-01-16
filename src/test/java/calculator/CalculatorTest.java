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

    @Test(expected = IllegalArgumentException.class)
    public void CalculateSquareArea_ZeroSideLength_Test() {
        calculator.CalculateSquareArea(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateSquareArea_NegativeSideLength_Test() {
        calculator.CalculateSquareArea(-1);
    }

    @Test
    public void CalculateRectArea_ValidSideLengths_Test() {
        assertEquals(20, calculator.CalculateRectArea(4, 5), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateRectArea_ZeroSideLength_Test() {
        calculator.CalculateRectArea(0, 100);
        calculator.CalculateRectArea(100, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateRectArea_ZeroSideLengths_Test() {
        calculator.CalculateRectArea(0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateRectArea_NegativeSideLength_Test() {
        calculator.CalculateRectArea(-1, 1);
        calculator.CalculateRectArea(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateRectArea_NegativeSideLengths_Test() {
        calculator.CalculateRectArea(-1, -1);
    }

    @Test
    public void CalculateSquareCirc_ValidSideLength_Test() {
        assertEquals(12, calculator.CalculateSquareCirc(3), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateSquareCirc_ZeroSideLength_Test() {
        calculator.CalculateSquareCirc(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateSquareCirc_NegativeSideLength_Test() {
        calculator.CalculateSquareCirc(-1);
    }

    @Test // original test method
    public void CalculateRectCircTest() {
        assertEquals(8, calculator.CalculateRectCirc(2,2));
    }

    @Test
    public void CalculateRectCirc_ValidSideLengths_Test() {
        assertEquals(18, calculator.CalculateRectCirc(3, 6), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateRectCirc_ZeroSideLength_Test() {
        calculator.CalculateRectCirc(0, 1);
        calculator.CalculateRectCirc(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateRectCirc_NegativeSideLength_Test() {
        calculator.CalculateRectCirc(-1, 1);
        calculator.CalculateRectCirc(1, -1);
    }

    @Test
    public void CalculateTriangleArea_ValidTriangle_Test() {
        assertEquals(10, calculator.CalculateTriangleArea(4, 5), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateTriangleArea_ZeroHeight_Test() {
        calculator.CalculateTriangleArea(4, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateTriangleArea_ZeroSideLength_Test() {
        calculator.CalculateTriangleArea(0, 5);
    }

    @Test
    public void CalculateTriangleCirc_ValidTriangle_Test() {
        assertEquals(9, calculator.CalculateTriangleCirc(2, 3, 4), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateTriangleCirc_IncorrectSumOfSides_Test() {
        calculator.CalculateTriangleCirc(1, 2, 3);
    }

    @Test
    public void ConvertCelsiusToFahrenheit_PositiveDegrees_Test() {
        assertEquals(78.8, calculator.convertCelsiusToFarenheit(26), DELTA);
    }

    @Test
    public void ConvertCelsiusToFahrenheit_ZeroDegrees_Test() {
        assertEquals(32, calculator.convertCelsiusToFarenheit(0), 0);
    }

    @Test
    public void ConvertCelsiusToFahrenheit_NegativeDegrees_Test() {
        assertEquals(-78.8, calculator.convertCelsiusToFarenheit(-26), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ConvertCelsiusToFahrenheit_BelowColdestPossible_Test() {
        calculator.convertCelsiusToFarenheit(-274);
    }

    @Test
    public void ConvertFahrenheitToCelsius_PositiveDegrees_Test() {
        assertEquals((double) 170 /9, calculator.convertFarenheitToCelsius(66), DELTA);
    }

    @Test
    public void ConvertFahrenheitToCelsius_ZeroDegrees_Test() {
        assertEquals((double) -160 /9, calculator.convertFarenheitToCelsius(0), DELTA);
    }

    @Test
    public void ConvertFahrenheitToCelsius_NegativeDegrees_Test() {
        assertEquals((double) -230 /9, calculator.convertFarenheitToCelsius(-14), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ConvertFahrenheitToCelsius_BelowColdestPossible_Test() {
        calculator.convertFarenheitToCelsius(-460);
    }

    @Test
    public void ConvertFromMphToKph_PositiveSpeed_Test() {
        assertEquals(161, calculator.convertFromMphToKph(100), DELTA);
    }

    @Test
    public void ConvertFromMphToKph_ZeroSpeed_Test() {
        assertEquals(0, calculator.convertFromMphToKph(0), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ConvertFromMphToKph_NegativeSpeed_Test() {
        assertEquals(Double.NaN, calculator.convertFromMphToKph(-100), 0);
    }

    @Test
    public void Factorial_PositiveNumber_Test() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void Factorial_OfOne_Test() {
        assertEquals(1, calculator.factorial(1));
    }

    @Test
    public void Factorial_OfZero_Test() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void Factorial_NegativeNumber_Test() {
        assertEquals(1, calculator.factorial(-1));
    }

    @Test
    public void Fibonacci_PositiveNumber_Test() {
        assertEquals(3, calculator.fibbonacci(4));
    }

    @Test
    public void Fibonacci_OfOne_Test() {
        assertEquals(0 , calculator.fibbonacci(0));
    }

    @Test
    public void Fibonacci_OfZero_Test() {
        assertEquals(0 , calculator.fibbonacci(0));
    }

    @Test
    public void Fibonacci_NegativeNumber_Test() {
        assertEquals(0 , calculator.fibbonacci(-1));
    }

    @Test
    public void FindGCD_TwoPositiveValues_Test() {
        assertEquals(3, calculator.findGCD(21, 12));
    }

    @Test
    public void FindGCD_SingleZero_Test() {
        assertEquals(3, calculator.findGCD(3, 0));
        assertEquals(3, calculator.findGCD(0, 3));
    }

    @Test
    public void FindGCD_DoubleZero_Test() {
        assertEquals(0, calculator.findGCD(0, 0));
    }

    @Test
    public void FindGCD_PositiveAndNegativeValues_Test() {
        assertEquals(5, calculator.findGCD(-10, 75));
        assertEquals(5, calculator.findGCD(75, -10));
    }

    @Test
    public void FindGCD_DoubleNegativeValues_Test() {
        assertEquals(-17, calculator.findGCD(-34, -187));
    }

    @Test
    public void FindLCM_DoublePositiveValues_Test() {
        assertEquals(39, calculator.findLCM(3, 13));
    }

    @Test(expected = IllegalArgumentException.class)
    public void FindLCM_SingleZero_Test() {
        calculator.findLCM(0, 1);
        calculator.findLCM(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void FindLCM_TwoZeros_Test() {
        calculator.findLCM(0, 0);
    }

    @Test
    public void FindLCM_SingleNegativeValue_Test() {
        assertEquals(6, calculator.findLCM(-2, 3));
        assertEquals(6, calculator.findLCM(2, -3));
    }

    @Test
    public void FindLCM_DoubleNegativeValues_Test() {
        assertEquals(6, calculator.findLCM(-2, -3));
    }

    @Test
    public void isPrime_PrimeNumber_Test() {
        assertTrue(calculator.isPrime(7));
    }

    @Test
    public void isPrime_CompositeNumber_Test() {
        assertFalse(calculator.isPrime(8));
    }

    @Test
    public void isPrime_One_Test() {
        assertFalse(calculator.isPrime(1));
    }

    @Test
    public void isPrime_Zero_Test() {
        assertFalse(calculator.isPrime(0));
    }

    @Test
    public void isPrime_NegativeValue_Test() {
        assertFalse(calculator.isPrime(-1));
    }
}
