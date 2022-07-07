import java.util.*;
public class secondFloat
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        float num1, num2, res;
        System.out.println("Enter a decimal number (upto 6 digits after decimal)");
        num1 = sc.nextFloat();
        System.out.println("Enter another decimal number(upto 6 digits after decimal)");
        num2 = sc.nextFloat();
        res = num1+num2;
        System.out.println("Addition of "+num1+" and "+num2+" is ="+res);
    }
}