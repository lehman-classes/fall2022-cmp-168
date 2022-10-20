import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo {
  
  public static void main(String[] args) {
    
    File file = new File("demo.txt");
    File copy = new File("demo-copy.txt");
    FileOutputStream fos = null;
    PrintWriter pw = null;

    try {
      if(!file.exists()) {
        file.createNewFile();

        // WRITING TO FILE USING THE FileOutputStream class
        // fos = new FileOutputStream(file);
        String data = "Hello World";
        // fos.write(data.getBytes());

        // WRITING TO FILE USING THE PrintWriter class
        pw = new PrintWriter(file);
        pw.write(data);
        pw.flush();
        System.out.println("file written");
      }
      // System.out.println(file.getCanonicalPath());
      System.out.println("file size: " + file.length());
      if(file.length() > 0) {
        fos = new FileOutputStream(copy);
        // READING INPUT FROM THE KEYBOARD USING System.in
        // Scanner scanner = new Scanner(System.in);

        // READING INPUT FROM A FILE
        Scanner scanner = new Scanner(file);
        int line = 1;
        // GOING LINE BY LINE TO PRINT IT
        while (scanner.hasNextLine()) {
          String stuff = scanner.nextLine();
          fos.write(stuff.getBytes()); 
          System.out.println(line++ + ": " + stuff);
        }

      }
      // if(file.exists()) {
      //   System.out.println("file exists");
      //   file.delete();
      // }
      System.out.println("file size: " + file.length());
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      try {
        if(fos != null) {
          fos.close();
        }
        if(pw != null) {
          pw.close();
        }
      } catch (Exception e) {
        //TODO: handle exception
      }
    }

    System.out.println(file.getPath());
    System.out.println(file.getAbsolutePath());

  }
}
