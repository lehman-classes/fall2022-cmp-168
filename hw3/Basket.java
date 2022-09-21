public class Basket {

  /*
  Basket

  - color: String
  - apples: Apple[] 

  + Basket() // default color to Red and array length to 100

  + addApple(Apple apple) // add Apple to array
  + removeAllApples() // clear out array 
  + printAll() // prints the year of each apple
  */
 
  String color;
  Apple[] apples ;

  Basket() {
    this.color = "Red";
    apples = new Apple[100];
  }

  public void addApple(Apple apple) {
    // add apple to array
  }

  public void removeAllApples() {
    // clear array
  }

  public void printAll() {
    System.out.println("printing all apples");
  }
}
