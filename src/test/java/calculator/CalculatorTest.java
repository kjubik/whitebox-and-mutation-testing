package calculator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void PowerTwoNumbersTest() {
        assertEquals(8.0, calculator.powerTwoNumbers(2.0, 3.0), 0);
    }

    @Test
    public void SqrtTest() {
        assertEquals(1.0, calculator.sqrt(1.0), 0);
    }

    @Test
    public void CalculateSquareAreaTest() {
        assertEquals(4, calculator.CalculateSquareArea(2), 0);
    }

    @Test
    public void CalculateRectAreaTest() {
        assertEquals(20.0, calculator.CalculateRectArea(4, 5), 0);
    }

    @Test
    public void CalculateSquareCircTest() {
        assertEquals(20, calculator.CalculateSquareCirc(5));
    }

    @Test
    public void CalculateRectCircTest() {
        assertEquals(8, calculator.CalculateRectCirc(2,2));
    }

    @Test
    public void CalculateTriangleAreaTest() {
        assertEquals(10, calculator.CalculateTriangleArea(4, 5), 0);
    }

    @Test
    public void CalculateTriangleCircTest() {
        assertEquals(12, calculator.CalculateTriangleCirc(3, 4, 5), 0);
    }

    @Test
    public void ConvertCelsiusToFahrenheitTest() {
        assertEquals(50, calculator.convertCelsiusToFarenheit(10), 0);
    }

    @Test
    public void ConvertFahrenheitToCelsiusTest() {
        assertEquals(10, calculator.convertFarenheitToCelsius(50), 0);
    }

    @Test
    public void ConvertFromMphToKphTest() {
        assertEquals(16.1, calculator.convertFromMphToKph(10), 0);
    }

    @Test
    public void FactorialTest() {
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void FibonacciTest() {
        assertEquals(5, calculator.fibbonacci(5));
        assertEquals(0, calculator.fibbonacci(0));
        assertEquals(1, calculator.fibbonacci(1));
        assertEquals(2, calculator.fibbonacci(3));
    }

    @Test
    public void FindGCDTest() {
        assertEquals(6, calculator.findGCD(24, 18));
        assertEquals(24, calculator.findGCD(24, 0));
    }

    @Test
    public void FindLCMTest() {
        assertEquals(72, calculator.findLCM(24, 18));
    }

    @Test
    public void IsPrimeTest() {
        assertFalse(calculator.isPrime(1));
        assertFalse(calculator.isPrime(4));
        assertTrue(calculator.isPrime(5));
    }
}
