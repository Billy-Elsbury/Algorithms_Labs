// Recursive factorial method

public class Factorial {

   public static void main(String[] args) {
      //Testing Factorial Method

      //Test case 1: 0 factorial
      int test1 = 0;

      int test1Output = factorial(test1);
      System.out.println("0 factorial should return 1, Output: " + test1Output);

      //Test case 2: 3 factorial
      int test2 = 3;

      int test2Output = factorial(test2);
      System.out.println("3 factorial should return 6, Output: " + test2Output);
   }
   // Recursive definition of method factorial
   public static int factorial( int n )
   {      
      if ( n == 1 || n == 0 )  // base case
         return 1;
      else {
         int result1 = factorial(n-1);
         int result = n * result1;
         return result;
      }
   }
}

