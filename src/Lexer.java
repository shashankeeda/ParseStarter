import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Class to build an array of Tokens from an input file
 * @author wolberd
 * @see Token
 * @see Parser
 * @see ByteCodeInterpreter
 */
public class Lexer {

    String buffer;
    int index = 0;
    public static final String INTTOKEN="INT";
    public static final String IDTOKEN="ID";
    public static final String ASSMTTOKEN="ASSMT";
    public static final String PLUSTOKEN="PLUS";
    public static final String EOFTOKEN="EOF";

    /**
     * call getInput to get the file data into our buffer
     * @param fileName the file we'll open
     */
    public Lexer(String fileName) {
        getInput(fileName);

    }

    /**
     * Reads given file into the data member buffer
     *
     * @param fileName name of file to parse
    */
    private void getInput(String fileName)  {
        try {
            Path filePath = Paths.get("test.txt");
            byte[] allBytes = Files.readAllBytes(filePath);
            buffer = new String (allBytes);
        } catch (IOException e) {
            System.out.println(e);
        }



    }


    public static void main(String[] args) {
        Lexer lexer = new Lexer("test.txt");

        System.out.println(lexer.buffer);


    }
}
	