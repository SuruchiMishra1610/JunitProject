package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class StringFunctionsTest {
	
	@Test
	public void Test1() {
		assertTrue(StringFunctions.isPalindrome("RADAR"));
	}
	
	@Test
	public void Test2() {
		assertFalse(StringFunctions.isPalindrome("SURUCHI"));
	}

	@DisplayName("Example of repeated Test")
	@RepeatedTest(4)
	public void Test3() {
		assertTrue(StringFunctions.isPalindrome("MOM"));
	}
	
}
