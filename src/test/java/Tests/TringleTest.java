package Tests;
import org.example.Tringle;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TringleTest {
    @Test
    public void testArea() {
        Assert.assertEquals(Tringle.area(5, 6), 15.0);
    }
}
