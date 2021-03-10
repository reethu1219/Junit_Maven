package junits;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagsExample {
	

	@CustomAnnotation

	public void junit1() {
		System.out.println("Inside tag1");
		
	}
	
	@Test
	@Tag("tag2")
	public void junit2() {
		System.out.println("Inside tag2");
		
	}
	
	@Test
	@Tag("tag3")
	public void junit3() {
		System.out.println("Inside tag3");
		
	}



}
