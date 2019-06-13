import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
//import example.util.Calculator;
import org.junit.jupiter.api.Test;
class HamcrestAssertionsDemo {
    private final Calculator calculator = new Calculator();
    @Test
    void assertWithHamcrestMatcher() {
        assertThat(calculator.subtract(4, 1), is(equalTo(3)));
    }
}