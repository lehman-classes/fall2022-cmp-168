import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {
    
    @Test 
    public void factorialOfZeroEqualsOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calculate(0);
        assertEquals(1, result);
    }

    @Test
    public void factorialOfOneEqualsOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calculate(1);
        assertEquals(1, result);
    }

    @Test
    public void factorialOfNEqualsNTimesNminusOne() {
        Factorial factorial = new Factorial();
        // 2 * (2-1)
        int result = factorial.calculate(2);
        assertEquals(2, result);
    }

    @Test
    public void factorialOfAnyValue() {
        Factorial factorial = new Factorial();
        // 2 * (2-1)
        int result = factorial.calculate(7);
        assertEquals(5040, result);
    }

}
