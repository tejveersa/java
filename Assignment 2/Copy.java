//Tejveer Singh
//ts355
//Section 004

import java.util.* ;  // scanner class
import java.io.*; //file reader class

public class Copy
{
   public static void main( String[] args )
   {
      List<String> items = new ArrayList<>();
      for (String line : readAllLines(("DataS.txt")))
      {
         for (String part : line.split("\\s+"))
         {
            Integer i = Integer.valueOf(part);
            numbers.add(i);
         }
      }
   }
}