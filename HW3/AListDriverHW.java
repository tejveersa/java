import java.util.*;
public class AListDriverHW
{
   //static variables for static get methods
   static int num = 0;
   static int index = -1;
   
   public static void main(String [] args)
   {
      int SIZE = 10;
      AList list = new AList(SIZE);
      
      //Answer to i
      int [] a = {11,4,15,20};
      for (int i=0; i<a.length; i++)
      {
         list.append(a[i]);
      }
      
      //Answer to ii
      int[] b = {9,3,7,22,13};
      list.moveToPos(2);
      for (int i=0; i<a.length; i++)
      { 
         list.insert(b[i]);
         list.next();
      }
      
      //Answer to iii
      System.out.println(list);
      
      //Answer to iv
      Scanner in = new Scanner(System.in);
      System.out.println("Would you like to change the list?");
      while(true)
      {
         System.out.print("Enter add, remove, or no: ");
         String action = in.next();
         if (action.equalsIgnoreCase("no"))
         { 
            break;
         }
         else if(action.equalsIgnoreCase("add"))
         {
            if (list.length() >= SIZE)
            {  
               //Answer to v
               System.out.println("List is full! You must remove an element to add an element.");
               continue;
            }
            System.out.println("Where do you want the element?");
            while (true)
            { 
               System.out.printf("Enter int from 0 to %d): ", list.length());
               getInd();
               if(index > list.length() || index < 0)
               {
                  System.out.println("Error: Index out of range.");
               }
               else
               {
                  break;
               }
            }
            
            list.moveToPos(index);
            System.out.print("Enter element:");
            getInt();
            list.insert(num);
            
         }
         else if(action.equalsIgnoreCase("remove"))
         {
            while (true)
            { 
               System.out.printf("Enter int from 0 to %d): ", list.length()-1);
               getInd();
               if (index > (list.length()-1) || index < 0)
               {
                  System.out.println("Error: Index out of range.");
               }
               else
               {
                  break;
               }
            }
            
            list.moveToPos(index);
            list.remove();
            System.out.println("Successfully removed!");
         }
         else
         {
            System.out.println("Invalid input try again");
            continue;
         }
         
         System.out.println(list);
         System.out.println("Would you like to change the list?");
         }
      }
      
   public static int getInt()
   {
      Scanner in = new Scanner(System.in);
      try
      {
         num = in.nextInt(); 
      }
      catch (InputMismatchException e)
      {
         System.out.print("Enter an integer: ");
         getInt();
      }
      return num;
   }
   
   public static int getInd()
   {
      Scanner in = new Scanner(System.in);
      try
      {
         index = in.nextInt();
      }
      catch (InputMismatchException e)
      {
         System.out.print("Enter an integer: ");
         getInd();
      }
      return index;
   }
}