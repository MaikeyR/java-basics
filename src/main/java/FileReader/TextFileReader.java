package FileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFileReader {
  /**
   * @param args
   */
  public static void main(String[] args) {
    InputStreamReader isr = null;
    BufferedReader br = null;
    try {
      isr = new InputStreamReader(TextFileReader.class.getResourceAsStream("/file.txt"));
      br = new BufferedReader(isr);
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
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          /* ensure close */
        }
      }
    }
  }
}
