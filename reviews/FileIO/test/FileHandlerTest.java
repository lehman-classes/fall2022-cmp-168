import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FileHandlerTest {
    
    @Test
    public void emptyFile() {
        FileHandler fh = new FileHandler();
        String content = fh.read("Test.txt");
        assertTrue(content, content.length() == 0);
    }

    @Test
    public void fileHasOneCharacter() {
        FileHandler fh = new FileHandler();
        String content = fh.read("Test.txt");
        assertTrue(content, content.length() == 1);
    }
}
