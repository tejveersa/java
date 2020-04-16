//Tejveer Singh
//ts355
//Section 004

import java.util.*;
import java.io.*; //file reader class

public class DirectoryLookUp
{
   public static void main( String[] args )
   {
     Scanner stdin = new Scanner( System.in );
      int listSize = 0;
      int count = 0; // tracks number of searches
      String[] list = new String[listSize];
      try{
            FileReader inputFile = new FileReader("DataS.txt");
            BufferedReader bufferReader = new BufferedReader(inputFile);
             
            String strNum = bufferReader.readLine();
            listSize = Integer.parseInt(strNum.trim()); //saves number of values in database a int
            list = new String[listSize];
            for(int i=0; i<listSize; i++){ //fills the data base with values 
               list[i] = (bufferReader.readLine()).trim(); 
            }
            bufferReader.close();
         }
         catch(Exception e){ //prints out error message if thier is a problem with reading from DataS.txt
            System.out.println("Error while reading file line by line:" + e.getMessage());             
            e.printStackTrace();                     
         }
         
         //check the the database
         
         for (int i=1; i <= list.length; i++){
            System.out.println("#"+i+" "+list[i-1]);
         }
         
         System.out.println("Database Server is Ready for String Lookups!");
         System.out.print("String to Lookup:");
         String input = stdin.next();
         do{
            boolean find = false;
            for(int i=0; i<listSize; i++){ //searches if imput is in the database
               if(input.equalsIgnoreCase(list[i])){ // test if user iumput is in data base
                  find = true;
                  break;
               }
               else
                  find = false;
            }
            if(find)
               System.out.println(input + " is in is in the database");
            else
               System.out.println(input + " is not in is in the database");  
            count++;
            System.out.print("String to Lookup:");
            input = stdin.next();
         }while(stdin.hasNext());
         System.out.println("number of searches = " + count);
            
   }
}