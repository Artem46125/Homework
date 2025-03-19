package Tests;
import org.example.Matematika;
import org.testng.annotations.Test;
import org.testng.Assert;

public class MatematikaTest {
    @Test
    public void testSum() {
        Assert.assertEquals(Matematika.sum(5, 5), 10);
    }

    @Test
    public void testSub() {
        Assert.assertEquals(Matematika.sub(5, 5), 0);
    }

    @Test
    public void testMult() {
        Assert.assertEquals(Matematika.mult(5, 5), 25);
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(Matematika.div(5, 5), 1);
    }
}
