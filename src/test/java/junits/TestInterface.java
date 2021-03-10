package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestInterface implements DefaultInterface{
	
	
	@Test
	public void junit1() {
		
		assertEquals(30,Calculator.add(10, 20));
		
		System.out.println("Inside Testcase");
	}
}
