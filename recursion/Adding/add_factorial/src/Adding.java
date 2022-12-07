
public class Adding {

    public int calculate(int a, int b) {

        // recursive method
        // if(a == 0) {
        //     return b;
        // }
        // return calculate(a-1, b+1);

        // iteractive method
        if(a == 0) {
            return b;
        }
        while(a !=0) {
            a = a - 1;
            b = b + 1;
        }
        return b;
    }

}
