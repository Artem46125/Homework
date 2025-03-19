package Testlesson14;

import org.junit.jupiter.api.Test;
import org.example.Matematika;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatematikaTest {
    @Test
    public void testsum() {
        assertEquals(10, Matematika.sum(5,5));
        assertEquals(15, Matematika.sum(10,5));
        assertEquals(20, Matematika.sum(-20,10));
    }
    @Test
    public void testmult() {
        assertEquals(10, Matematika.mult(2,5));
        assertEquals(15, Matematika.mult(3,5));
    }
    @Test
    public void testdiv() {
        assertEquals(10, Matematika.div(20,2));
        assertEquals(100, Matematika.div(200,2));
    }
    @Test
    public void testsub() {
        assertEquals(10, Matematika.sub(20,10));
        assertEquals(100, Matematika.sub(200,100));
    }
}
