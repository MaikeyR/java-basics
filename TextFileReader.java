import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


public class TextFileReader {
  /**
 * @param args
 */
public static void main(String[] args) {
    FileReader fr = null;
    BufferedReader br = null;
    try {
        fr = new FileReader("file.txt");
        br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            // process the line
            System.out.println(line);
        }
    } catch (FileNotFoundException e) {
        System.err.println("Can not find specified file!");
        e.printStackTrace();
    } catch (IOException e) {
        System.err.println("Can not read from file!");
        
        e.printStackTrace();
    } finally {
        if (br != null) try { br.close(); } catch (IOException e) { /* ensure close */ }
        if (fr != null) try { fr.close(); } catch (IOException e) { /* ensure close */ }
    }
  }
}
