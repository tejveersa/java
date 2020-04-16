import java.util.Scanner;

class SpeakerDriver
{
   public static void main(String args[])
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Name of Bill: ");
      String bill = scan.next();
      System.out.println("Name of Team: ");
      String team = scan.next();
      System.out.println("Name of Movie: ");
      String movie = scan.next();
      
      SpeakerOfTheHouse a = new SpeakerOfTheHouse();
      a.speak();
      a.announce(bill);
      
      SportsAnnouncer b = new SportsAnnouncer();
      b.speak();
      b.announce(team);

      Actor c = new Actor();
      c.speak();
      c.announce(movie);
   }
}
