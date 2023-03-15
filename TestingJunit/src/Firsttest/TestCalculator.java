package Firsttest;

import static org.junit.Assert.*;

import java.util.function.Predicate;

import org.junit.Test;
import org.junit.Before;
public class TestCalculator {
	// Calculator calc=new Calculator();// direclty creating the objext 
	Calculator calc;
	 @Before
	 public void setUp() throws Exception {
		 calc=new Calculator();
	 }

	@Test
	public void testPowerZero() {
		int inputBase =0;
		int exp=0;
		int expectedValue=0;
		
		int actualValue=calc.power(inputBase,exp);
		assertEquals(expectedValue, actualValue);
	}
	@Test
	public void testPower() {
		int inputBase=2; 
		int exp=3;
		int expectedValue =8;
		int actualValue=calc.power(inputBase, exp);
		assertEquals(expectedValue,actualValue);
		
			//	fail("Not yet implemented");
	}

	
	
	



}
