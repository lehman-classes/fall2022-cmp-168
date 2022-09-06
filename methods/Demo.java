
public class Demo {

  // this is a method
  // which happens to be the main or "entry-point" for our program
  // the MAIN method
  public static void main(String[] args) {

    // execution starts here
    Demo demo = new Demo();
    // "calling" a method
    demo.countUntil(5);
  
    int x = demo.luckyNumber();
    System.out.println("lucky number is " + x);

    Demo.sayHello("Hendrix");

  }

  // this is a void method. Hence, it does not return a value
  // it just executes the statements between the brackets.
  // one way to think about method is...
  // they do One Thing And One Thing Only
  public void countUntil(int count) {

    for (int i = 1; i <= count; i++) {
      System.out.println(i); 
    }

  }

  // this is a value method. It does return a value of type int
  public int luckyNumber() {
    return 7;
  }

  // this is a static void method. It does not return a value. It is static therefore
  // it is in memory hence does not need the object to be "called"
  public static void sayHello(String name) {
    System.out.println("Hello, " + name);
  }
}
