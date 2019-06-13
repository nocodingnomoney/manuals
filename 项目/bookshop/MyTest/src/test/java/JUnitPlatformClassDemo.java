import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.fail;
@RunWith(JUnitPlatform.class)
public class JUnitPlatformClassDemo {
    @Test
    void succeedingTest() {
        /* no-op */
    }
    @Test
    void failingTest() {
        fail("Failing for failing's sake.");
    }
}