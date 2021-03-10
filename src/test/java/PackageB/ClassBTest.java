package PackageB;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassBTest {
    
    @Tag("Production")
    @Test
    @DisplayName("My Junit2")
    public void junit1() {
        
        System.out.println("Inside junit2");
    }
}
