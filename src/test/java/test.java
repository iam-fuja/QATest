// src/test/java/ExampleTest.java
import org.testng.annotations.Test;

public class ExampleTest {

    @Test
    public void samplePassingTest() {
        assert 2 + 2 == 4;
    }

    @Test
    public void sampleFailingTest() {
        assert 2 * 2 == 5 : "This test should fail";
    }
}
