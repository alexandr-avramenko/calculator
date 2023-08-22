package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void testAdding() {
        //Given
        float a = 5;
        float b = 9;
        float expected = 14;

        //When
        float actual = calc.add(a, b);

        //Then
        assertEquals(expected, actual);
    }
    @Test
    public void testSubtraction() {
        //Given
        float a = 1;
        float b = 1;
        float expected = 0;

        //When
        float actual = calc.subtraction(a, b);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testDivision() {
        //Given
        int a = 9;
        int b = 3;
        int expected = 3;

        //When
        int actual = calc.division(a, b);

        //Then
        assertEquals(expected, actual);
    }
    @Test
    public void testDivisionOnZero() {
        //Given
        int a = 9;
        int b = 0;

        //When //Then
        assertThrows(ArithmeticException.class, () -> {
            calc.division(a, b);
        });
    }

    @Test
    public void testMultiply() {
        //Given
        float a = 8;
        float b = 5;
        float expected = 40;

        //When
        float actual = calc.multiply(a, b);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyWithZero() {
        //Given
        float a = 8;
        float b = 0;
        float expected = 0;

        //When
        float actual = calc.multiply(a, b);

        //Then
        assertEquals(expected, actual);
    }


}
