import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestTest {
    @Test
    public void testTest() {

        Assert.assertTrue(true);

    }

    @Ignore
    @Test
    public void testNegative() {

        Assert.assertTrue(false);

    }
}
