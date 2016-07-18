package com.java.calculator;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Before
    public void setUp() {
        System.out.println("Before");
        calculator = new Calculator();

    }

    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void validateTwoNumbersAddition() {
        System.out.println("test add");
        int result = calculator.add(3, 5);
        int expected = 8;

        assertEquals("Function of additional of two numbers returned result",
                expected, result);
    }

    @Test
    public void validateTwoNumbersSutbrutcion() {
        System.out.println("test subtruct");
        int result = calculator.subtract(7, 8);
        int expected = -1;

        assertEquals("!!!", expected, result);
    }

    @Test(expected = DivisionByZero.class)
    @Ignore
    public void shouldThrowDivideByZeroException() throws DivisionByZero {
        int result = calculator.divide(5, 0);
    }
/*
    @Test(timeout = 20)
    public void testTimeOut() {
        for (int i = 0; i < 10000000; i++) {
            int k = i / 10 + 10;
            System.out.println(k);
        }
    }
    */

}
