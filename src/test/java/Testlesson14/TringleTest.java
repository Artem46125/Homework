package Testlesson14;

import org.example.Tringle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TringleTest {
    @Test
    public void testTringle() {
        double a = 5.0;
        double b = 6.0;
        double expectedArea = 15.0;
        assertEquals(expectedArea, Tringle.area(a, b), 0.0001, "Площадь треугольника должна быть равна 15.0");
    }
}
