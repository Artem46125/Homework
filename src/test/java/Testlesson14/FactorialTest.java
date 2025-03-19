package Testlesson14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Factorial;

public class FactorialTest {
    @Test
    public void testFactorial() {
        assertEquals(1, Factorial.getFactorial(1), "Факториал 1 должен быть равен 1");
        assertEquals(2, Factorial.getFactorial(2), "Факториал 2 должен быть равен 2");
        assertEquals(120, Factorial.getFactorial(5), "Факториал 5 должен быть равен 120");
    }
}
