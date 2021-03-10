package junits;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestEx {
	
	@DisplayName("Example1 for repeated test")
	@RepeatedTest(4)
	public void junit1() {
		System.out.println("inside junit1");
	}

}
