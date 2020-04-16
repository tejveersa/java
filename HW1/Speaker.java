//********************************************************************
//  Speaker.java   
//
//********************************************************************

public interface Speaker
{
   public abstract void speak();
   public abstract void announce (String str);
}

class SpeakerOfTheHouse implements Speaker
{
   public void speak()
   {
      System.out.println("I am the Speaker of the House.");
   }
   public void announce(String str)
   {
      
      System.out.println("The " + str +" has passed");
   }
}

class SportsAnnouncer implements Speaker
{
   public void speak()
   {
      System.out.println("Goal!");
   }
   public void announce(String str)
   {
      System.out.println("The " + str +" have scored a goal!");
   }
}

class Actor implements Speaker
{
   public void speak()
   {
      System.out.println("I've been nominated for three Academy Awards.");
   }
   public void announce(String str)
   {
      System.out.println("I'm currently staring in " + str+ ".");
   }
}