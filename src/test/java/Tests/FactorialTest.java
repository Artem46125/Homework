package Tests;
import org.example.Factorial;
import org.testng.annotations.Test;
import org.testng.Assert;


public class FactorialTest {
    @Test
    public void Test1() {
        Assert.assertEquals(Factorial.getFactorial(0), 1, "Факториал 0 равен 1");
    }

    @Test
    public void testFactorialOfOne() {
        Assert.assertEquals(Factorial.getFactorial(1), 1, "Факториал 1 равен 1");
    }

    @Test
    public void testFactorialOfFive() {
        Assert.assertEquals(Factorial.getFactorial(5), 120, "Факториал 5 равен 120");
    }

}
