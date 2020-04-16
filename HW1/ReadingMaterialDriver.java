class ReadingMaterialDriver
{
   public static void main(String args[])
   {
      String[] a = {"Harry Potter", "Hermione Granger", "Ronald Weasley", "Voldemort"};
      Novel harryPotter = new Novel("Harry Potter", "JK Rowling", 303, a);
      harryPotter.summary();
      System.out.println(harryPotter.isLong());
      
      String[] b = {"Iron Man", "Captain America", "Black Widow", "The Hulk", "Thor"};
      GraphicNovel avengers = new GraphicNovel("Avengers", "Stan Lee", 50, b, "Jack Kirby");
      avengers.listCharcters();
      avengers.summary();
      
      Article pc = new Article("The Social Meaning of the Personal Computer","Bryan Pfaffenberger", 10, "Anthropological Quarterly");
      System.out.println(pc.isLong());
      pc.summary();

   }
}    