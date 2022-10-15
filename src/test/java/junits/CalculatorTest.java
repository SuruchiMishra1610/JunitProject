package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
	
	@Test
	public void Test1() {
		
		assertEquals(11,Calculator.add(5, 6));
				
	}
	
	@Test
	public void Test2() {
		
		assertEquals(10,Calculator.sub(70, 60));
				
	}

}
