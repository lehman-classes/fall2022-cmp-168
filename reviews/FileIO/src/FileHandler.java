import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {

    public void createFile(String fileName) {
        PrintWriter outStream = null; // notice this is not inside the try block
        try {

            outStream = new PrintWriter(fileName); // create and connect to a new empty file

        } catch (FileNotFoundException e) {
            System.err.println("Could not create the file " + fileName);
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close(); // close the stream and release resources
            }
        }
    }

    public void writeFile(String fileName, String text) {
        PrintWriter outStream = null;// notice this is not inside the try block
        try {
            outStream = new PrintWriter(fileName);// create and connect to a new empty file
            outStream.println(text);// write text to the file
        } catch (FileNotFoundException e) {
            System.err.println("Could not create the file " + fileName);
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close();// close the stream and release resources
            }
        }

    }

    public void readFile(String fileName) {
        Scanner inStream = null;
        String fileContents = "";
        try {
            inStream = new Scanner(new File(fileName));
            fileContents = inStream.nextLine();
            System.out.println(fileContents);// display line on console
        } catch (FileNotFoundException fnfe) {
            System.err.println("Could not read from file " + fileName + "\n" + fnfe.getMessage());
        } finally {
            if (inStream != null) {
                inStream.close();// close the stream and release resources
            }
            System.out.println("DONE reading from file " + fileName);
        }

    }

}
