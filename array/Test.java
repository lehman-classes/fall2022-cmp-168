
public class Test {
  public static void main(String[] args) {
    // nums here represent some testing data, it could anything
    int[] nums = {1,2,3};
    // Array here represent "your" code
    int total = Array.sum(nums);
    if(total == 6) {
      System.out.println("Passed");
    } else {
      System.out.println("Failed");
    }
  }
}
