
public class Fibonacci {

    public int calculate(int i) {
        // base case
        if (i == 0 || i == 1 ) {
            return i;
        }
        return calculate(i - 1) + calculate(i - 2);
    }

}
