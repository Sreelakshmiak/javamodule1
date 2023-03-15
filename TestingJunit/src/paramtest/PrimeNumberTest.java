package paramtest;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)

public class PrimeNumberTest {
 
	private final Integer inputNumber;
	private final Boolean expectedResult;
	private PrimeNumber PrimeNumber;
	
	@Before 
	public void initialize() {
		PrimeNumber=new PrimeNumber();
		
	}
	
	
	public PrimeNumberTest( Integer inputNumber, Boolean expectedResult)
	{
		this.inputNumber=inputNumber;
		this.expectedResult=expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection PrimeNumber() {
		
		return Arrays.asList(new Object[][]{
			{2,true},
			{6,false},
			{19,true},
			{22,false},
			{23,true},
			{24,false},
			{10,true}}
			);
		
	}
		
	
	@Test
	public void testValidator() {
		
		System.out.println("parameterized number is "+inputNumber);
		assertEquals(expectedResult,PrimeNumber.validate(inputNumber));
		//fail("Not yet implemented");
	}
}

