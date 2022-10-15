package pkgA;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunctions;

@Tag("Sanity")
@Tag("Nightly")
public class PkgATest {
	
	
	@Test
	@DisplayName("part of PkgA Test")
	public void Test1() {
		assertTrue(StringFunctions.isPalindrome("RADAR"));
	}

}
