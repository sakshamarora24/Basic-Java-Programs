import java.util.*;
public class evenoddifelse
{
    public static void main (String args[])
    {
        Scanner check = new Scanner (System.in);
        double num;
        System.out.println("Enter a number to check even or odd.");
        num = check.nextDouble();
        if(num%2==1)
        {
            System.out.println("Your number "+num+" is an odd number.");
        //System.out.println("Your number "+num+" is an even number.");
        }
        else
        {
        //System.out.println("Your number "+num+" is an odd number.");
        System.out.println("Your number "+num+" is an even number.");
        }
    }
}