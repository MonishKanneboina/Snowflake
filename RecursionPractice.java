import static java.lang.System.*;
import java.util.*;



public class RecursionPractice {

   public static double sumReciprocals(int n)  {
      if (n > 0) {
         return 1.0/n + sumReciprocals(n - 1);
      } else {
         return 0;
      }
   }
   
   public static int productOfEvens(int n)
   {
      if(n == 1)
      {
         return 2;
      }
      else 
      {
         return productOfEvens(n-1) * (n*2);
      }
   }
   
   public static void doubleUp(Stack<Integer> nums)
   {
      if (!nums.isEmpty())
      {
         int n = nums.pop();
         doubleUp(nums);
         nums.push(n);
         nums.push(n);
      } 
   }
   
      
   public static void countToBy(int n, int m)
   {
      if(n - m > 0)
      {
         countToBy(n-m, m);
         System.out.print(", " + n);
      }
      else 
      {
         System.out.print(n);
      }     
   }
   
   public static int matchingDigits(int a, int b)
   {
      int counter = 0;
      if (a == 0)
         {
            counter = 0;
         }
      else if (a % 10 == b % 10)
         {
            counter++;
            if (b == 0 && counter == 1)
               {
                  return 1;
               }
            counter += matchingDigits(a/10, b/10);
         }
      else
      {
         counter += matchingDigits(a/10, b/10);
      }
      
      return counter;
   }
   
   public static void printThis(int n)
   {
      if (n == 1)
      {
         System.out.print("*");
      }
      else if (n == 2)
      {
         System.out.print("**");
      }
      else
      {
         System.out.print("<");
         printThis(n-2);
         System.out.print(">");
      }  
   }
   
   
   public static void printNums2(int n)
   {
      
         if (n == 2)
         {
            System.out.print("1 1");
         }
         else if (n == 1)
         {
            System.out.print("1");
         }
         else 
         {
         System.out.print((n+1)/2 + " ");
         printNums2(n-2);
         System.out.print(" " + (n+1)/2);
         }
      
   }  
         

/**
*  Use this main method for running tests.
*/
   public static void main(String[] args) {
      System.out.println(sumReciprocals(10)); //Should print 2.9289682539682538
      System.out.println(productOfEvens(4));
      Stack<Integer> s = new Stack<>();
      s.push(3);
      s.push(7);
      s.push(12);
      s.push(9);
      System.out.println(s.toString());
      doubleUp(s);
      System.out.println(s.toString());
      countToBy(25, 4);
      System.out.println();
      System.out.println(matchingDigits(1000, 0));
      printThis(8);
      System.out.println();
      printNums2(6);
   }
   
   }


