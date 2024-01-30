package com.cmi.tic;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BasicMathOperationsSymflowerTest {
	@Test
	public void divide1() {
		BasicMathOperations b = new BasicMathOperations();
		int dividend = -1;
		int divisor = -1;
		int expected = 1;
		int actual = b.divide(dividend, divisor);

		assertEquals(expected, actual);
	}

	@Test
	public void divide2() {
		BasicMathOperations b = new BasicMathOperations();
		int dividend = -1;
		int divisor = -2;
		int expected = 0;
		int actual = b.divide(dividend, divisor);

		assertEquals(expected, actual);
	}

	@Test
	public void divide3() {
		BasicMathOperations b = new BasicMathOperations();
		int dividend = -1;
		int divisor = 2;
		int expected = 0;
		int actual = b.divide(dividend, divisor);

		assertEquals(expected, actual);
	}

	@Test
	public void divide4() throws ArithmeticException {
		BasicMathOperations b = new BasicMathOperations();
		int dividend = -2147483648;
		int divisor = -1;
		 assertThrows(java.lang.ArithmeticException.class, () -> {
		b.divide(dividend, divisor);
		});
	}

	@Test
	public void divide5() {
		BasicMathOperations b = new BasicMathOperations();
		int dividend = -2147483648;
		int divisor = -1073741825;
		int expected = 1;
		int actual = b.divide(dividend, divisor);

		assertEquals(expected, actual);
	}

	@Test
	public void divide6() {
		BasicMathOperations b = new BasicMathOperations();
		int dividend = 0;
		int divisor = -1;
		int expected = 0;
		int actual = b.divide(dividend, divisor);

		assertEquals(expected, actual);
	}

	@Test
	public void divide7() throws ArithmeticException {
		BasicMathOperations b = new BasicMathOperations();
		int dividend = 0;
		int divisor = 0;
		 assertThrows(java.lang.ArithmeticException.class, () -> {
		b.divide(dividend, divisor);
		});
	}

	@Test
	public void divide8() {
		BasicMathOperations b = new BasicMathOperations();
		int dividend = 0;
		int divisor = 1;
		int expected = 0;
		int actual = b.divide(dividend, divisor);

		assertEquals(expected, actual);
	}

	@Test
	public void divide9() {
		BasicMathOperations b = new BasicMathOperations();
		int dividend = 1;
		int divisor = -2;
		int expected = 0;
		int actual = b.divide(dividend, divisor);

		assertEquals(expected, actual);
	}

	@Test
	public void divide10() {
		BasicMathOperations b = new BasicMathOperations();
		int dividend = 1;
		int divisor = 2;
		int expected = 0;
		int actual = b.divide(dividend, divisor);

		assertEquals(expected, actual);
	}
}
