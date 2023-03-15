package Firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPalin {
	Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before test executed..");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after executing all test cases");
	}

	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
		System.out.println("before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after each test");
	}

	@Test
		public void testPalindrome() {
			int n=12321; 
			boolean expectedValue=true;
			boolean actualValue=calc.palindrome(n);
			assertEquals(expectedValue, actualValue);
			//fail("Not yet implemented");
		}

		//fail("Not yet implemented");
	}


