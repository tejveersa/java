//Tejveer Singh
//ts355
//Section 004

import java.util.* ;  // scanner class
public class TempConversion
{  
   public static void main( String[] args )
   {
      Double boilingPointF = 212.0;
      Double freezingPointF = 32.0;
      Double boilingPointK = 373.0;
      Double freezingPointK = 273.0;
      
      Scanner stdin = new Scanner(System.in);
      System.out.println("Enter 0.0 for F -> K, 1 for K -> F");
      double F2K = stdin.nextInt();

      if (F2K == 0)
      {
         System.out.println("Please enter a Fahrenheit temperature to convert");
         while(stdin.hasNext())
         {
            
            double f = stdin.nextDouble();
            if (f == boilingPointF)
               System.out.println("Boiling point");
            if (f == freezingPointF)
               System.out.println("Freezing point");
            System.out.format("Fahrenheit: %.2f to Kelvin: %.2f \n",f, ((((f-32)*5)/9)+273));
            System.out.println("Please enter a Fahrenheit temperature to convert");         
         }
         
      }
      else if(F2K == 1)
      {
         System.out.println("Please enter a Kelvin temperature to convert");
         while(stdin.hasNext())
         {
            double k = stdin.nextDouble();
            if (k == boilingPointK)
               System.out.println("Boiling point");
            if (k == freezingPointK)
               System.out.println("Freezing point");
            System.out.format("Kelvin: %.2f to Fahrenheit: %.2f \n" ,k, ((((k-273)*9)/(5))+32));
            System.out.println("Please enter a Fahrenheit temperature to convert");
          }
      }
     System.out.println("Goodbye");
   }
}

         
         
      
      
            