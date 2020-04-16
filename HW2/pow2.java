public class pow2
{
double rpow2(int x, int n)  
{
    if (n == 0)  
       return 1.0;
       if (n % 2 == 1)
      {
         double y = rpow2(x, (n - 1) / 2);
         return x * y * y;
      } 
       else 
         {
              double y = rpow2(x, n / 2);
              return y * y;
         }
 }
 }