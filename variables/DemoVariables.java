// must declare a class. Name must be same as file without the extension .java
public class DemoVariables {

  // if it is an executable, it must have an "entry-point"
  // in Java that is a main method
  public static void main(String[] params) {

    // no code to execute here

    // place a "box" or "placeholder" in the computer "memory"
    // so that I can store some value
    // variable number
    int number = 0;
    System.out.println("number is " + number);
    
    number = 5;
    System.out.println("number is " + number);

    int a = 1;
    int b = 2;
    int c = a + b;
    System.out.println(c);


    String name = "Hendrix";

    name = "askldjfklasdlskdjflkjasdlkfjsakdjlkfjasdklfjawlksdjflka lksajdlkjflkasjd";
    name = "a";

    // loop
    String s = "a";
    for (int index = 0; index < 1000000; index++) {
      s = "a" + index;
      System.out.println(s);
    }

    System.out.println(name);

    // talking about scope

    // memory
    // static
    // [] [] [] [] [] [] [] [] 
    // [] [] [] [] [] [] [] [] 
    // [memory 0] -- // flag to be deallocated... Garbage Collector
    // [memory 1]

    // dynamic
    // [memory 0]
    // [H] [e] [n]...
    // [memory 1]
    // [a] [s]....


  }
}
