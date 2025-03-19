package Tests;

import org.example.Compare;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CompareTest {

    @Test
    public void testFirstNumberGreater() {
        Assert.assertEquals(Compare.compareNumbers(5, 3), "Первое число больше второго.");
    }

    @Test
    public void testFirstNumberLess() {
        Assert.assertEquals(Compare.compareNumbers(2, 4), "Первое число меньше второго.");
    }

    @Test
    public void testNumbersEqual() {
        Assert.assertEquals(Compare.compareNumbers(7, 7), "Оба числа равны.");
    }
}
