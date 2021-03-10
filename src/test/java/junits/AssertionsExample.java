package junits;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionsExample {
	
	@DisplayName("Annotations Example")
	@Test
	public void junit1() {
		
		String str1 = "Simplilearn";
		String str2 = "Simplilearn";
		String str3=null;
		
		int i=1;
		int j=2;
		
		String[] expectedArray = {"one","two","three"};
		String[] resultArray = {"one","two","three"};
		
		assertEquals(str1, str2);
		
		assertNull(str3);
		
		assertTrue(j>i);
		
		assertArrayEquals(expectedArray,resultArray);
	}

}
