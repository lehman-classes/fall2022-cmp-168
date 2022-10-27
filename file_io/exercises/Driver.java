public class Driver {
  
  public static void main(String[] args) {
    
    // Question 1
    TextFileHandler handler = new TextFileHandler();
    // Question 2
    handler.createNewFile("data.txt");

    // Question 3
    handler.writeToNewFile("data.txt", "Some text");
    // Question 4
    handler.writeToNewFile("data.txt", "More text");

    // Question 5
    handler.appendToFile("data.txt", "Something else");

    // Question 6
    handler.readFileDisplayOnConsole("data.txt");

    // Question 7
    if(handler.copyFile("data.txt")) {
      System.out.println("file copied.");
    } else {
      System.out.println("file NOT copied.");
    }
    
  }
}
