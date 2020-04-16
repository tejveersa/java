public class pow
{
   long rpow(int x, int y)
   {
      long result;
      if (x == 1 || y == 0)
         return 1;
      else
         result = (x*rpow(x, y-1));
         return result;
   }
}
         