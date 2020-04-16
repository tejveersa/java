//Tejveer Singh
//ts355
//Section 004

import java.util.* ;  // scanner class

public class Copy
{
   public static void main( String[] args )
   {
      Scanner stdin = new Scanner( System.in );
      System.out.println( "Ready to copy numbers!\nEnter EOT when done" ) ;
      double num;
      int n = 0;
      double total = 0;
      while(stdin.hasNext())
      {
         n += 1;
         num = stdin.nextDouble();
         total += num;
         System.out.format( "%.2f\n", num );
         if(num == 0)
         {
            n -= 1;
            System.out.format("Count: = %d\n",n);
            System.out.format("Total: %.2f\n", total);
            System.out.format("Average: %.2f\n", total/n);
            System.out.println("\nGoodbye!") ;
            break;
         }
      }
      System.exit( 0 ) ;
   }
}