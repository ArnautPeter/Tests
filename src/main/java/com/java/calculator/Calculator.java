package com.java.calculator;

public class Calculator {

    public int add(int op1, int op2) {
        return op1 + op2;
    }

    public int subtract(int op1, int op2) {
        return op1 - op2;
    }

    public int divide(int op1, int op2) throws DivisionByZero {
        if (op2 == 0) {
            throw new DivisionByZero("Yor cant divide by zero");
        }
        return op1 / op2;
    }
}
