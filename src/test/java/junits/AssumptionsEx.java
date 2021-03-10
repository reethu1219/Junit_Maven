package junits;



import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssumptionsEx {
	
	@DisplayName("Assumption example")
	@Test
	public void junit1() {
		
		System.setProperty("ENV","DEV");
		
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		
		assertEquals(30,Calculator.add(10,20));

	}
	

}
