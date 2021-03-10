package junits;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ParamProvider.class)
public class ParamTest {
	
	@Test
	public void junit(String name) {
		System.out.println(name);
	}

}
