
/**
 * Runner
 */
public class Runner extends Object{

  public static void main(String[] args) {

    System.out.println(Person.magicNumber);
    Person.magicNumber = 13;
    Person.run("abc");

    int num = 10;
    boolean b = false;

    // creating an instance of our class Person
    // this simply means Java uploads 'instance' or instructions in the heap part of memory
    Person p = new Person("Walter");
    System.out.println(p);
    System.out.println(p.getName());
    System.out.println(p.magicNumber);
    p.magicNumber = 33;
    p.run();


    // another instance of the same public class Person 
    // Java uploads 'instance' in the heap
    Person p1 = new Person();
    System.out.println(p1.magicNumber);
    p1.setName("Walter");
    p1.run();
    p1 = p;
    System.out.println(p.equals(p1));
    p.setName("Jesse");
    System.out.println(p.getName());
    System.out.println(p1.getName());

    Person p2 = new Person("Saul");
    System.out.println(p2.magicNumber);
    p2.run();



    System.out.println(Person.magicNumber);


  }

  
}
