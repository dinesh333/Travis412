package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(5, 5), 10);
	}
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		int answer = calc.minus(5, 3);
		assertEquals(answer, 2);
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		int answer = calc.multiply(5, 3);
		assertEquals(answer, 15);
	}
	
	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		double answer = calc.divide(20, 5);
		assertEquals(answer, 4, 0.00);
	}
}
