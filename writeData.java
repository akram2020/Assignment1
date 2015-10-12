
/**
 * Name : Muhammad Akram Bin Ahmad
 * Matric: 2014873252
 * Course Code: ITT786
 * DESCRIPTION: Write ".txt" type data.
 */

import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

public class writeData {

  public static void main(String[] args) {

    // Convert the string to a
    // byte array.
    String s = "\r\nName: Muhammad Akram Bin Ahmad \r\nMatric No: 2014873252 \r\nGender: Male \r\nAge: 24 \r\nE-mails: akram_ahmad2020@yahoo.com \r\nMobile No: 0175209042";
    byte data[] = s.getBytes();
    Path p = Paths.get("C:/Users/Acer/Documents/ITT786/akram.txt");

    try (OutputStream out = new BufferedOutputStream(
      Files.newOutputStream(p, CREATE, APPEND))) {
      out.write(data, 0, data.length);
    } catch (IOException x) {
      System.err.println(x);
    }
  }
}
 
