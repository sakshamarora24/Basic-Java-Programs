import java.util.*;
public class greatest
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        double num1, num2, num3;
        System.out.println("Enter first number");
        num1 =scan.nextDouble();
        System.out.println("Enter second number");
        num2 =scan.nextDouble();
        System.out.println("Enter third number");
        num3 =scan.nextDouble();
        if (num1>num2 && num1>num3)
        {
           System.out.println("Greatest number is ="+num1);
        }
        else if (num2>num1 && num2>num3)
        {
           System.out.println("Greatest number is ="+num2);
        }
        else
        {
           System.out.println("Greatest number is ="+num3);
        }
    }
}