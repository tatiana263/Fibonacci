package co.edu.unbosque.Fibo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.edu.unbosque.Fibo.model.Fibonacci;

public class FibonacciTest {

	@Test
	public void TestFibonacci() {
		assertEquals(0, Fibonacci.Fibonacci(0));
		assertEquals(1, Fibonacci.Fibonacci(1));
		assertEquals(1, Fibonacci.Fibonacci(2));
		assertEquals(2, Fibonacci.Fibonacci(3));
		assertEquals(3, Fibonacci.Fibonacci(4));
		assertEquals(5, Fibonacci.Fibonacci(5));
	}

}