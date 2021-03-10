package junits;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Annotations {
	@BeforeAll
	public static void beforeall() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void beforejunit() {
		System.out.println("Before junit");
	}
	
	@Test
	public void junit1() {
		System.out.println("inside my junit1");
	}
	@Disabled
	@Test
	public void junit2() {
		System.out.println("inside my junit2");
	}
	
	@AfterEach
	public void afterjunit() {
		System.out.println("After junit");
	}
	
	@AfterAll
	public static void afterall() {
		System.out.println("After All");
	}
	
	

}
