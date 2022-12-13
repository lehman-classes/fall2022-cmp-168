import java.io.FilenameFilter;

public class App {
    public static void main(String[] args) throws Exception {

        String fileName = "resources/Test.txt";
        FileHandler fh = new FileHandler();
        fh.createFile(fileName);
        fh.writeFile(fileName, "Hello world!");
        fh.readFile(fileName);
    }
}
