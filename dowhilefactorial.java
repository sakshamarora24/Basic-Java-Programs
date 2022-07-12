import java.util.*;
public class dowhilefactorial
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      int num, res=1;
      System.out.println("Enter a number.");
      num=scan.nextInt();
      do
      {  res=res*num;
         num--;
      }
      while(num>=1);
      System.out.println("Factorial of number is = "+res);
     }
 }