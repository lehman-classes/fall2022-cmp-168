
// this the 'real world' thing that we are trying to represent
public class Person {

 
  // field or member variable - properties of the object
  private String name;
  private int age;

  public static int magicNumber = 7;

  
  // default constructor (no parameters) - executes when the 'new' keyword is used
  // Person person = new Person();
  public Person() {
    name = "Pedro";
    System.out.println(this.hashCode());
  }

  // another constructor - notice a different 'signature' which is the [NAME ( PARAM(s) )] combination
  // Person p = new Person("theName", 20);
  // overload constructor
  public Person(String name) {
    this.name = name;
    System.out.println(this.hashCode());
  }


  // setter - use to set the value for private member variable
  public void setName(String name) {
    this.name = name ;
  }

  // public void setAge(int age) {
  //   this.age = age;
  // }

  // getter - use to return the value for private member variable
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public boolean isMinor() {
    return (age < 18);
  }

  // method - or the thing this object can do
  public void run(){
    System.out.println( this.hashCode() + " is running");
  }

  // overload method
  public static void run(String n) {

  }

  @Override
  public String toString() {
    return "Person: " + name + " age: " + age ;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj != null & obj instanceof Person) {
      return ((Person)obj == this);
    }
    return false;
  }

  // @Override
  // public int hashCode() {
  //   return 1;
  // }


  // MEMORY
  // [
  //
  // [MY PROGRAM
  //    [ STACK  p p1]
  //    [ magicNumber=7]
  //    [ HEAP  p.name p.age p1.name p1.age]
  // ]
  //
  //
  //
  //
  //
  //
  //
  //
  //
  //
  // ]
}
