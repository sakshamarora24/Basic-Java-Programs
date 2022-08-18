import java.util.*;
public class secondsmall
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int num1, num2, num3, a, b;
        System.out.println("Enter three unequal numbers.");
        num1=scan.nextInt();
        num2=scan.nextInt();
        num3=scan.nextInt();
        a=Math.max(num1,num2);
        b=Math.max(a,num3);
    }
}