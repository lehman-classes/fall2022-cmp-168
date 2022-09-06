
public class Array {
  public static void main(String[] args) {
   // test methods here 
    int[] myArray = {45, 22, 18, 89, 82, 79, 15, 69, 100, 55, 48, 72, 16, 98, 57, 75, 44, 32, 21, 14, 7, 16, 49, 58, 72};

    int total = Array.sum(myArray);
    System.out.println("Sum of whole array = " + total);
  }

  // write methods here

  // This method will compute the sum of all the elements in the parameter array arr
  public static int sum(int[] arr) {

    int result = 0;
    for (int i = 0; i < arr.length; i++) {
     result = result + arr[i]; 
    }
    return result;
  }


}
