
/**
 * Name : Muhammad Akram Bin Ahmad
 * Matric: 2014873252
 * Course Code: ITT786
 * DESCRIPTION: Read ".txt" type data.
 */

import java.io.*;

public class readData
{
   public static void main(String args[])
    {
      try{
       
             FileInputStream file = new FileInputStream("C:/Users/Acer/Documents/ITT786/akram.txt");
        
             DataInputStream input = new DataInputStream(file);
        
             BufferedReader buffer = new BufferedReader(new InputStreamReader(input));
        
             String strLine;
      
                while ((strLine = buffer.readLine()) != null)   
                {
                 System.out.println (strLine);
                }
        
        input.close();
         
        }
        
        catch (Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}