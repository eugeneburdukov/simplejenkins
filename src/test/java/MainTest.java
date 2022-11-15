import org.junit.Assert;
import org.junit.Test;

public class MainTest extends Main {
    @Test
    public void doFirstFactorialTest() {
        Main main = new Main();
        int result = doFactorial(5);
        Assert.assertEquals(result, 120);
    }

    @Test
    public void doSecondFactorialTest() {
        Main main = new Main();
        int result = doFactorial(2);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void doThirdFactorialTest() {
        Main main = new Main();
        int result = doFactorial(23);
        Assert.assertEquals(result, 2);
    }
}
