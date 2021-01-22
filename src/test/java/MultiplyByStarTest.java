import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplyByStarTest {

    @Test
    public void shouldMultiplyToSix() {
        int a = 2;
        int b = 3;
        int expected = 6;

        MultiplyMethod m = new MultiplyByStar();
        assertEquals(expected, m.multiplyNumbers(a, b));
    }
}