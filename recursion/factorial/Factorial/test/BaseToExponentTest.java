import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class BaseToExponentTest {

    @Test
    public void exponentZeroEqualsOne() {
        BaseToExponent baseToExponent = new BaseToExponent();
        int result = baseToExponent.calculate(3,0);
        assertEquals(1, result);
    }

    @Test
    public void exponentIsOneEqualsBase() {
        BaseToExponent baseToExponent = new BaseToExponent();
        int result = baseToExponent.calculate(3,1);
        assertEquals(3, result);
    }


    @Test
    public void exponentIsAnyValueEqualsBaseTimesRecursionExponentMinusOne() {
        BaseToExponent baseToExponent = new BaseToExponent();
        int result = baseToExponent.calculate(3,2);
        assertEquals(9, result);
    }

    @Test
    public void baseToExponentAnyValue() {
        BaseToExponent baseToExponent = new BaseToExponent();
        int result = baseToExponent.calculate(3,4);
        assertEquals(81, result);
    }

}