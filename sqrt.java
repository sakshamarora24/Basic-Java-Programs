import java.util.*;
public class sqrt
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num1;
        double sqt, fl, sqr;
        System.out.println("Enter a number.");
        num1=scan.nextInt();
        sqt = Math.sqrt(num1);
        fl = Math.floor(sqt);
        sqr=fl*fl;
        if(num1==sqr)
        {
            System.out.println(+num1+" is a perfect square.");
        }
        else
        {
            System.out.println(+num1+" is not perfect square.");
        }
    }
}