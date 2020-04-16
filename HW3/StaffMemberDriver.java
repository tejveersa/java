import java.util.*;

public class StaffMemberDriver
{
   public static void main(String[] args)
   {
      //Answer to i
      Staff s = new Staff();
      ArrayList<StaffMember> a = new ArrayList ();
      
      System.out.print(a);
      for (int i = 0; i<s.getSize(); i++)
      {
         a.add(s.getStaff(i));
      }
      
      //Answer to ii
      Scanner in = new Scanner(System.in);
      
      while (true)
      {
         System.out.print("\nEnter s(search), r(remove), or a(add): ");
         String action = in.next();
         if (action.equalsIgnoreCase("s"))
         {
            System.out.print("\nEnter name to search: ");
            String search = in.next();
            int index = find(a, search);
            if (index<0 || index>a.size())
            {
               //Answer to iii
               System.out.println("Not Found!");
               continue;
            }
            System.out.println(a.get(index));
            System.out.printf("Type of employee: %s\n", (a.get(index)).getClass());
            System.out.printf("Employee pay: %s\n", (a.get(index)).getPay());
         }
         else if(action.equalsIgnoreCase("r"))
         {
            System.out.print("\nEnter name to remove: ");
            String search = in.next();
            int index = find(a, search);
            if(index<0 || index>a.size())
            {
               System.out.println("Name not found!");
               continue;
            }
            a.remove(index);
            System.out.print("Record deleted successfully.");
         }
         else if(action.equalsIgnoreCase("a"))
         {
            System.out.println("Enter the type of employee to add to record.");
            System.out.print("V(Volunteer), E(Employee), X(Executive), or H(Hourly): ");
            String type = in.next();
            if(type.equalsIgnoreCase("V"))
            {
               getGenInput();
               a.add(new Volunteer (name, address, phone));
            }
            else if(type.equalsIgnoreCase("E"))
            {
               getGenInput();
               System.out.print("Social Security Number: ");
               String ss = in.next();
               System.out.print("Enter pay: ");
               getDoubleInput();
               a.add(new Employee(name, address, phone, ss, pay));
            }
            else if(type.equalsIgnoreCase("X"))
            {
               getGenInput();
               System.out.print("Social Security Number: ");
               String ss = in.next();
               System.out.print("Enter pay: ");
               getDoubleInput();
               a.add(new Executive(name, address, phone, ss, pay));
            }
            else if(type.equalsIgnoreCase("H"))
            {
               getGenInput();
               System.out.print("Social Security Number: ");
               String ss = in.next();
               System.out.print("Enter pay: ");
               getDoubleInput();
               a.add(new Hourly(name, address, phone, ss, pay));
            }
            else
            {
               System.out.println("Invalid input!");
            }
         }
         else
         {
            System.out.println("Invalid input! Try again.");
         }
      }
   }
   
   public static int find(ArrayList<StaffMember> x, String y)
   {
      int index = -1;
      Scanner in = new Scanner(System.in);
      
      for (int i = 0; i<x.size(); i++)
      {
         if((x.get(i)).getName().toLowerCase().contains(y.toLowerCase()))
         {
            index = i; 
            break;
         }
      }
      return index;
   }
   
   static String name = "", address = "", phone = "";
   
   public static void getGenInput()
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter name: ");
      name = in.next();
      System.out.print("Enter full address: ");
      address = in.next();
      System.out.print("Enter phone number with area code: ");
      phone = in.next();
   }
   
   static double pay = 0.0;
   
   public static double getDoubleInput()
   {
      Scanner in = new Scanner(System.in);
      try
      {
         pay = in.nextDouble(); 
      }
      catch (InputMismatchException e)
      {
         System.out.print("Not a number! Enter pay: ");
         getDoubleInput();
      }
      return pay;
   }
}