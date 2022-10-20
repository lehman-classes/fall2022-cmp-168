import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
  
  public static void main(String[] args) {
    
    File file = new File("demo.txt");
    try {
      file.createNewFile();
      file.setReadOnly();
      // System.out.println(file.getCanonicalPath());
      System.out.println("file size: " + file.length());
      // Scanner scanner = new Scanner(System.in);
      Scanner scanner = new Scanner(file);
      String stuff = scanner.nextLine();
      System.out.println("stuff: " + stuff);

      // if(file.exists()) {
      //   System.out.println("file exists");
      //   file.delete();
      // }
      System.out.println("file size: " + file.length());
    } catch (IOException e) {
      System.out.println(e);
    }

    System.out.println(file.getPath());
    System.out.println(file.getAbsolutePath());

  }
}
