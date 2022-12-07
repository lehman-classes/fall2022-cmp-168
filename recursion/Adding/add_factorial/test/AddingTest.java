import static org.junit.Assert.assertEquals;

import org.junit.*;

public class AddingTest {

    @Test
    public void addingZero() {
        Adding add = new Adding();
        int result = add.calculate(0,0);
        assertEquals(0, result);
    }
    
    @Test
    public void addingZeroPlusOne() {
        Adding add = new Adding();
        int result = add.calculate(0, 1);
        assertEquals(1, result);
    }

    @Test
    public void addingZeroPlusAny() {
        Adding add = new Adding();
        int result = add.calculate(0, 23);
        assertEquals(23, result);
    }

    @Test
    public void addingAnyPlusAny() {
        Adding add = new Adding();
        int result = add.calculate(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void addingAnyPlusAnyBig() {
        Adding add = new Adding();
        int result = add.calculate(42, 37);
        assertEquals(79, result);
    }
}