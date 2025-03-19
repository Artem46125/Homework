package Testlesson14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Compare;

public class CompareTest {

    @Test
    public void test1() {
        assertEquals("Первое число больше второго.", Compare.compareNumbers(5, 3));
    }

    @Test
    public void test2() {
        assertEquals("Первое число меньше второго.", Compare.compareNumbers(2, 4));
    }

    @Test
    public void test3() {
        assertEquals("Оба числа равны.", Compare.compareNumbers(7, 7));
    }

    @Test
    public void test4() {
        assertEquals("Первое число меньше второго.", Compare.compareNumbers(-5, -3));
    }

}
