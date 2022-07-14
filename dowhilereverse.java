import java.util.*;
public class dowhilereverse
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num, rev=0;
        System.out.println("Enter a number.");
        num=scan.nextInt();
        do
        {
           rev = rev*10;
           rev = rev + num%10;
           num = num/10;
        }
        while(num!=0);
        System.out.println("Reverse of a number is = "+rev);
    }
}