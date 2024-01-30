package com.cmi.tic;

public class BasicMathOperations {

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            throw new ArithmeticException("Integer overflow: " + dividend + " / " + divisor);
        }

        int sign;
        if(dividend<0 &&divisor<0 ||dividend>0 && divisor>0){
            sign =1;
        }
        else {
            sign=-1;
        }

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        if (absDividend == 0) {
            return 0;
        }

        long result = 0;

        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            result++;
        }

        result *= sign;

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Integer overflow: " + dividend + " / " + divisor);
        }

        return (int) result;
    }
}
