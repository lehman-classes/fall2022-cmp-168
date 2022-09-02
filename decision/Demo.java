
public class Demo {
  public static void main(String[] args) {
    
    
    // decision branching

    if( false ) { // this condition determines if block {} executes
      System.out.println("It's true");
    } else if(true) {
      System.out.println("1");

    } else if(true) {
      System.out.println("2");

    } else if(true) {
      System.out.println("3");

    }
    System.out.println("done");

    int KEY = 3;

    switch (KEY) {
      case 2:
        System.out.println("KEY is " + 2);        
      case 3:
        System.out.println("KEY is " + 3);        
        break;
      case 4:
        System.out.println("KEY is " + 4);        
        break;

      default:
        System.out.println("KEY is " + KEY);        
        break;
    }
 }
}
