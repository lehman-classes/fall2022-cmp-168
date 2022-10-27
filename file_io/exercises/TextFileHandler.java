import java.io.File;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TextFileHandler implements TextFileIOable {

  public void createNewFile(String fileName) {
    try {
      File file = new File(fileName);
      file.createNewFile();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void writeToNewFile(String fileName, String text) {
    PrintWriter pw = null;
    try {
      File file = new File(fileName);
      pw = new PrintWriter(file);
      pw.println(text);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(pw != null) {
        pw.close();
      }
    }
  }

  public void appendToFile(String fileName, String text){ 
    PrintWriter pw = null;
    try {
      File file = new File(fileName);
      pw = new PrintWriter(new FileOutputStream(file, true));
      pw.println(text);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(pw != null) {
        pw.close();
      }
    }
  }

  public String readFile(String fileName){ 
    return "";
  }

  public void readFileDisplayOnConsole(String fileName){ 
    Scanner scanner = null;
    try {
      scanner = new Scanner(new File(fileName));
      while(scanner.hasNext()) {
        System.out.println(scanner.nextLine());
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if(scanner != null) {
        scanner.close();
      }
    }
  }

  public boolean copyFile(String origFileName){ 
    Scanner scanner = null;
    PrintWriter pw = null;
    try {
      File origFile = new File(origFileName);
      File dupFile = new File("copy-" + origFileName);
      dupFile.createNewFile();
      scanner = new Scanner(origFile);
      pw = new PrintWriter(new FileOutputStream(dupFile));
      while(scanner.hasNext()) {
        pw.println(scanner.nextLine());
      }
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    } finally {
      if(scanner != null) {
        scanner.close();
      }
      if(pw != null) {
        pw.close();
      }
    }
    return true;
  }

  public boolean copyFile(String origFileName, String copiedFileName){ 
    return false;
  }

  public boolean deleteFile(String fileName){ 
    return false;
  }
  
  public void writeToFileFromKeyboard(String fileName){ 
  }

  public boolean findAndReplaceContentInFile(String fileName, String originalText, String replacementText){ 
    return false;
  }

  public void readFileChosenUsingFileChooser(){ 
  }
  
}
