import java.util.*;
public class smaller
{
    public static void main (String args [])
    {
        Scanner sl = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter your first number.");
        num1 =sl.nextDouble();
        System.out.println("Enter your second number.");
        num2 =sl.nextDouble();
        if(num1<num2)
        {
        System.out.println("Your number "+num1+" is smaller than "+num2);
        }
        else
        {
        System.out.println("Your number "+num2+" is smaller than "+num1);
        }    
    }
    }
