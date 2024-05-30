import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTest {
    @Test
    public void testTest(){

        Assert.assertTrue(true);

    }

    @Test
    public void testFail() {
        Assert.assertTrue(false);
    }
}
