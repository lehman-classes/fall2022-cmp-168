
import java.util.Scanner;

// agreed upon by the Java community
public class Demo {
  // this is BAD?... creating a global variable
  //public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    String value = scanner.next();
    System.out.println("value is " + value);

    scanner.close(); // close method to signal I'm done using this resource
  }
}
