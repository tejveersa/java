public class Factorial
{
   int fact(int digit)
      {
         int result;
         if (digit == 1)
            return 1;
         else
            result = (fact(digit-1)*digit);
            return result;
       }
}
            