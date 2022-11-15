import org.junit.Assert;
import org.junit.Test;

public class MainTest extends Main{
    @Test
    public void doFactorialTest() {
        Main main = new Main();
        int result = doFactorial(5);
        Assert.assertEquals(result, 120);
    }
}
