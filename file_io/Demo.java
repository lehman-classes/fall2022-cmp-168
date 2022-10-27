import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Demo {
  
  public static void main(String[] args) {
    
    File file = new File("demo.txt");
    File copy = new File("demo-copy.txt");
    FileOutputStream fos = null;
    PrintWriter pw = null;

    try {
      // if(!file.exists()) {
      //   file.createNewFile();
      //
      //   // WRITING TO FILE USING THE FileOutputStream class
      //   // fos = new FileOutputStream(file);
      //   String data = "Hello World";
      //   // fos.write(data.getBytes());
      //
      //   // WRITING TO FILE USING THE PrintWriter class
      //   pw = new PrintWriter(file);
      //   pw.write(data);
      //   pw.flush();
      //   System.out.println("file written");
      // }
      // System.out.println(file.getCanonicalPath());
      System.out.println("file size: " + file.length());
      if(file.length() > 0) {
        fos = new FileOutputStream(copy);
        // READING INPUT FROM THE KEYBOARD USING System.in
        // Scanner scanner = new Scanner(System.in);


        // READING FILE USING FileReader class
        // FileReader fr = new FileReader(file);
        // char[] c = new char[256];
        // fr.read(c);
        // System.out.println("START");
        // System.out.print(c);
        // System.out.println("END");

        // // READING INPUT FROM A FILE using Scanner class
        Scanner scanner = new Scanner(file);
        int line = 1;
        // GOING LINE BY LINE TO PRINT IT
        while (scanner.hasNextLine()) {
          String stuff = scanner.nextLine();

          // COPY FROM ONE FILE TO ANOTHER
          fos.write(stuff.getBytes()); 
          System.out.println(line++ + ": " + stuff);
        }

        // YET ANOTHER WAY TO READ A FILE 
        // BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        // byte[] c = new byte[bis.available()];
        // bis.read(c);
        // for (int i = 0; i < c.length; i++) {
        //   System.out.print((char) c[i]);
        // }
        // System.out.println();


      }
      // if(file.exists()) {
      //   System.out.println("deleting file demo.txt");
      //   file.delete();
      // }
      System.out.println("file size: " + file.length());
    // } catch (FileNotFoundException e) {
    //   System.out.println(e);
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
