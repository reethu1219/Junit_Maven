package PackageA;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassATest {
    
    @Tag("Production")
    @Test
    @DisplayName("My Junit1")
    public void junit1() {
        
        System.out.println("Inside junit1");
    }
}