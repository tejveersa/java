
public class ReadingMaterial
{
   protected String title;
   protected String author;
   protected int numPages;
   
   public ReadingMaterial(String name, String writer, int length)
   {
      title = name;
      author = writer;
      numPages = length ;
   }
   
   public boolean isLong()
   {
      if (numPages > 250)
         return true;
      else
         return false;
   }
   
   public void summary()
   {
      System.out.printf("%s, written by %s\n", title, author);
   }
}
   
 class Novel extends ReadingMaterial
 {
   private String[] characters;
   
   public Novel(String title, String author, int numPages, String[] x)
   {
      super(title, author, numPages);
      characters = x;
   }
   
   public void listCharcters()
   {
      for(int a=0; a < characters.length; a++)
         System.out.println(characters[a]);
   }
 }
 
 class Article extends ReadingMaterial
 {
   private String publication;
   
   public Article(String title, String author, int numPages, String publisher)
   {
      super(title, author, numPages);
      publication = publisher;
   }
   
   public void summary()
   {
      System.out.println(title + " writen by " + author + ", published in " + publication);
   }
 }
    
 class GraphicNovel extends Novel
 {
   private String illustrator;
   
   public GraphicNovel(String title, String author, int numPages, String[] characters, String artist)
   {
      super(title, author, numPages, characters);
      illustrator = artist;
   }
   
   public void summary()
   {
      System.out.println(title + " writen by " + author + ", illustrated by " + illustrator);
   }
 }