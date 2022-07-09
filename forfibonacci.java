import java.util.*;
public class forfibonacci
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      int num1=0, num2=1, sum=0, p;
      System.out.println("Fibonacci series of first 10 numbers.");
      for(p=0;p<=10;p++)
      {
         System.out.print(sum+"\t");
         num1=num2;
         num2=sum;
         sum=num1+num2;
      }
     }
 }