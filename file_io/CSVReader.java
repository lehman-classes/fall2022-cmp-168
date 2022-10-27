import java.util.Scanner;
import java.io.File;

public class CSVReader {
  
  public static void main(String[] args) {
    
    try {
      
      Scanner s = new Scanner(new File("csv.txt"));
      while (s.hasNextLine()) {
        String line = s.nextLine();
        String[] values = line.split(",");
        String courseNum = values[0];
        String dept = values[1];
        String classDesc = values[2];
        String orderNum = values[3];

        System.out.println(courseNum);
        // for (String value : line.split(",")) {
        //   System.out.print(value + " ");
        // }
      }
    } catch (Exception e) {
      //TODO: handle exception
    }
  }
}
