
public class Demo {
  public static int CAR_RACING = 0;
  public static int MOTO_RACING = 1;
  public static int ROCKET_LAUNCH = 2;

  public static void main(String[] args) {

    // for (/* initialize stuff here */; /* condition */; /* increment or decrement */) {
    //  // infinite loop 
    //   System.out.println("1");
    // }

    int[] nums = {1,2,3,4,5};
    int i = 0;
    // for each - "use for?"
    for (int string : nums) {
      System.out.println(string);
      if (i == 2) {
        break;
      }
      i++;
    }

    // while 
    // int i = 0;
    // while (/* provide condition here */ i <= 3) {
    //  System.out.println(i); 
    //   // update condition here
    //   i++;
    // }

    // boolean condition = false;
    // do-while
    // do {
    //  // will execute at least once 
    //   System.out.println("Hi");
    // } while (condition);

    
    // int condition = Integer.parseInt(args[0]);
    // if(condition == CAR_RACING) {
    //   for (int i = 3; i >= 1; i--) {
    //     System.out.println(i);
    //   }
    //   System.out.println("Let's go!");
    // } else if(condition == MOTO_RACING) {
    //   for (int i = 5; i >= 1; i--) {
    //     System.out.println(i);
    //   }
    //   System.out.println("Careful there");
    // } else if(condition == ROCKET_LAUNCH) {
    //   for (int i = 10; i >= 1; i--) {
    //     System.out.println(i);
    //   }
    //   System.out.println("To the moon!");
    // } else {
    //   System.out.println("Easy there");
    // }
    // loops

    // count down application
    // System.out.println(3);
    // System.out.println(2);
    // System.out.println(1);
    // System.out.println("Go!");
  }
}
