import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ExampleTest {
    @Test
    void sipmpleTest() {
        var actual = System.getProperty("browser", "Chrome");
        Assertions.assertEquals("Chrome", actual);
    }
}
