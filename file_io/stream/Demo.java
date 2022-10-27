import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Demo {
  
  public static void main(String[] args) {
    
    BufferedReader in = null;

    try {
      in = new BufferedReader(new InputStreamReader(System.in));
      char c = 0;
      do {
        c = (char)in.read();
        // System.out.println(c);
      }while(c != 'q'); 
    } catch (Exception e) {
      //TODO: handle exception
      System.out.println(e);
    }
    // Stream<String> stream = in.lines().

      
  }
}
