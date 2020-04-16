import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class Driver
{
	public static void main(String[] args)
   {
		final String FILE_ADDRESS = "test.dat";
		
		LList<String> alist = new LList<String>();
		
		// part A
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_ADDRESS)))
      {
			for(String line = br.readLine(); line != null; line = br.readLine())
         {
				alist.append(line);
			}
		}
		catch (FileNotFoundException e)
      {
			System.out.println("File not found.");
		}
		catch (IOException e)
      {
			System.out.println("File could not be read.");
		}
		
		// print alist and size
		System.out.println(alist);
		
		// get the 5th link (index 4)
		alist.moveToPos(4);
		System.out.println("\nValue of 5th record: " + alist.getValue());
		
		Scanner scanner = new Scanner(System.in);
		// part B
		while (true)
      {
			System.out.print("\nEnter a record (String) to delete (empty to skip): ");
			String input = scanner.nextLine();
			if (input.length() == 0)
         {
				break;
         }
			else
         {
				int index = indexOf(alist, input);
			
            if (index > -1)
            {
               alist.remove();
				   System.out.println("Removed.");
				   System.out.println(alist);
			   }
			   else
            {
			   	System.out.println("Not found.");
			   }
         }
		}
		
		// part C
		while (true)
      {
			System.out.print("\nEnter a record (String) to insert (empty to skip): ");
			String input = scanner.nextLine();
			if (input.length() == 0)
         {
				break;
         }
			else
         {
				int index = indexOf(alist, input);
			
            if (index > -1)
            {
				   System.out.println("Already exists.");
            }
			   else
            {
					alist.moveToStart();
					alist.insert(input);
					System.out.println("Added.");
					System.out.println(alist);
			   }
         }
		}
		
		// part 2
      
		System.out.println("Part 2 (reverse)\n");
		System.out.println("Before: " + alist.toString());
		alist.reverse();
		System.out.println("After: " + alist.toString());
		
		scanner.close();
	}
	
	static <T> int indexOf(LList<T> list, T element)
   {
		list.moveToStart();
		for (int i = 0; i < list.length(); i++)
      {
			if (list.getValue().equals(element))
         {
				return i;
         }
			list.next();
		}
		return -1;
	}
}