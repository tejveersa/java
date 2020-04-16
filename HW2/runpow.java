import java.util.Scanner;
import java.util.*;
public class runpow
{
   public static void main(String[] args)
   {
      
      System.out.println("Running Normal Power Function:");
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the base: ");
      while (!scan.hasNextInt())
      {
         System.out.print("Invalid input. Enter again: ");
         scan.next();
      }
      int base = scan.nextInt();
      System.out.print("Enter the power: ");
      while (!scan.hasNextInt())
      {
         System.out.print("Invalid input. Enter again: ");
         scan.next();
      }
      
      int power = scan.nextInt();
      
      long startTime = System.nanoTime();

 
      pow po = new pow();
      System.out.println(po.rpow(base,power));

      long stopTime = System.nanoTime();
      long elapsedTime = stopTime - startTime;
      System.out.println("Time: "+elapsedTime);
      
      System.out.println("Running The Better Power Function:");
      System.out.print("Enter the base: ");
      while (!scan.hasNextInt())
      {
         System.out.print("Invalid input. Enter again: ");
         scan.next();
      }
      
      base = scan.nextInt();
      System.out.print("Enter the power: ");
      while (!scan.hasNextInt())
      {
         System.out.print("Invalid input. Enter again: ");
         scan.next();
      }
      
      power = scan.nextInt();
      
      startTime = System.nanoTime();


      pow2 pows = new pow2();
      System.out.println(pows.rpow2(base,power));
      
      stopTime = System.nanoTime();
      long runtime = stopTime - startTime;
      System.out.println("Time: " + elapsedTime);

      System.out.println("The better recursive power function was " + (double) (elapsedTime/runtime)+ " nanoseconds faster than \'Normal\' recursive function.");
   }
}
     