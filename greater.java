import java.util.*;
public class greater
{
    public static void main (String args [])
    {
        Scanner gt = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter your first number.");
        num1 =gt.nextDouble();
        System.out.println("Enter your second number.");
        num2 =gt.nextDouble();
        if(num1==num2)
        {
         System.out.println("Both the numbers are equal!!");
                                                                          }
        else
        {
        
         if(num1>num2)
          {
          System.out.println("number "+num1+" is greater than "+num2);
          }
          else
          {
          System.out.println("number "+num2+" is greater than "+num1);
          }
        }
    }
  }
