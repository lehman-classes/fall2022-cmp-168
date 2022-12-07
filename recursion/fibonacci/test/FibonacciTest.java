import static org.junit.Assert.assertEquals;

import org.junit.*;

public class FibonacciTest {

    @Test
    public void fibonacciOfZero() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.calculate(0);
        assertEquals(0, result);
    }

    @Test
    public void fibonacciOfOne() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.calculate(1);
        assertEquals(1, result);
    }

    @Test
    public void fibonacciOfTwo() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.calculate(2);
        assertEquals(1, result);
    }

    @Test
    public void fibonacciOfThree() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.calculate(3);
        assertEquals(2, result);
    }

    @Test
    public void fibonacciOfAny() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.calculate(12);
        assertEquals(144, result);
    }
}
