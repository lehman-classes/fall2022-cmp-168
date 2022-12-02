
public class BaseToExponent {

    public int calculate(int x, int n) {
        if(n == 0){
            return 1;
        }
        if(n == 1) {
            return x;
        }
        return x * calculate(x, n-1);
    }

}
