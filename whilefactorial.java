import java.util.*;
public class whilefactorial
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      int num, res=1;
      System.out.println("Enter a number.");
      num=scan.nextInt();
      while(num>=1)
      {  res=res*num;
         num--;
      }
      System.out.println("Factorial of number is = "+res);
     }
 }