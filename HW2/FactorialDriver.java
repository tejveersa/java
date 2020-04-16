import java.util.Scanner;

class FactorialDriver
{
   public static void main(String[] args)
   {
      int digit;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a numerical number: ");
      while (!scan.hasNextInt())
      {
         System.out.print("Invalid input. Enter numerical number: ");
         scan.next();
      }
      
      digit = scan.nextInt();
      Factorial factor = new Factorial();
      System.out.println(factor.fact(digit));

   }
}

class oddevenfact
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a numerical number: ");
      
      while (!scan.hasNextInt())
      {
         System.out.print("Invalid input. Enter again: ");
         scan.next();
      }
      
      int digit = scan.nextInt();
      
      Oddevenfactorial factor = new Oddevenfactorial();
      System.out.println(factor.fact(digit));

   }
}   