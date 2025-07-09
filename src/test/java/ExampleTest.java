import org.testng.annotations.Test;

public class ExampleTest {

    @Test
    public void samplePassingTest() {
        assert 2 + 2 == 4;
    }

    @Test
    public void sampleFixedTest() {
        assert 2 * 2 == 4 : "This test should pass";
    }
}
