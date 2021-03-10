package junits;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public interface DefaultInterface {
	
	@Test
	default void testPalindrome(){
		
	 boolean flag=StringFunctions.isPalindrome("radar");
		
		assertTrue(flag);
		assertFalse(StringFunctions.isPalindrome("sagrdfht"));
		
		System.out.println("Inside interface");
		
	}

}
