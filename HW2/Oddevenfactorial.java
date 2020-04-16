public class Oddevenfactorial
{
   int fact(int digit)
      {
         int result;
         if (digit == 1 || digit == 0)
            return 1;
         else
            result = (fact(digit-2)*digit);
            return result;
       }
}
         