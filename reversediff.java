import java.util.*;
public class reversediff
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num, num2=0, rev=0, mod, diff=0;
        System.out.println("Enter a number.");
        num=scan.nextInt();
        num2=num;
        while(num!=0)
        {
           mod=num%10;
           rev = rev*10 + mod;
           num = num/10;
        }
        if(num2>rev)
        {
            diff=num2-rev;
        }
        else if (rev>num2)
        {
            diff=rev-num2;
        }
        else
        {
            diff=0;
        }
        System.out.println("Original number is = "+num2);
        System.out.println("Reverse of the number is = "+rev);
        System.out.println("Absolute difference of the number is = "+diff);
    }
}