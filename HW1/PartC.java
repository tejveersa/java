import java.util.Random;

public class PartC
{
   public static void main(String[] args){
   int [][] twoD = new int[2][10];
   for (int i = 0; i<twoD.length; i++)
   {
      for (int j = 0; j<twoD[i].length; j++)
      {
         twoD[i][j] = (int) (Math.random()*901 + 100);
         System.out.print(twoD[i][j]+"\t");
      }
   System.out.println();
   }
   int [] temp = new int[twoD[0].length];
   for (int j = 0; j<twoD[0].length; j++)
   {
      temp[j] = twoD[0][j];
      twoD[0][j] = twoD[1][j];
      twoD[1][j] = temp[j];
   }
   for (int i = 0; i<twoD.length; i++)
   {
      for (int j = 0; j<twoD[i].length; j++)
      {
         System.out.print(twoD[i][j]+"\t");
      }
   System.out.println();
   }

} 
}  