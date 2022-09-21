
/**
 * Demo
 */
public class Demo {

  public int num = 2;

  public static void main(String[] args) {
    
    // I am creating a list of integers with a length of 5
    // int[] nums = new int[5];
    int[] nums = {4, 7, 2, 3, 1}; /// array is initialize by providing a list values
    // EVERY array firstIndex at index 0
    // EVERY array lastIndex at length - 1
    // index  => [0] [1] [2] [3] [4]  -----> total of 5 things, hence length is 5, therefore 5-1 is lastIndex
    // values => [4] [7] [2] [3] [1]


    // how is an integer stored in memory
    // [____ ____]

    // [____ ____]   =  [] [] [] []

    // [____ ____]   =  [] []


    // rotateElements result => 
    // values => [1] [4] [7] [2] [4]

    // how do you create variables
    // [provide a data type] [provide a name for the thing] [initialize or not]

    // int[] nums = new int[5]; /// thing is NOT initialize
    // int[] nums = {4, 7, 12, 3, 2}; /// array is initialize by providing a list values

    // String[] names = new String[4];
    // String[] names = {"Joe", "Wil", ...};

    Demo.javaParamPassing(nums);
    System.out.println(nums[0]);

  }

  public static void javaParamPassing(int[] x) {
    // java always pass-by-value 
    System.out.println("x is " + x[0]);
    x[0] = 9;
    System.out.println("x is " + x[0]);
  }
  
  
  public static int sum(int[] nums) {
    // an accumulator
    int sum = 0;
    // iterating an array of nums
    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
      // System.out.println(nums[i]);
    }
   return sum; 
    // System.out.println("sum = " + sum);
  }
}
