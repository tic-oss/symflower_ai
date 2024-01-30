package com.cmi.tic;
import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            try {
                return BigInteger.valueOf(n).multiply(factorial(n - 1));
            } catch (ArithmeticException e) {
                throw new ArithmeticException("Factorial calculation resulted in overflow for input: " + n);
            }
        }
    }
}
