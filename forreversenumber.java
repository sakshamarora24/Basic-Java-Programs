import java.util.*;
public class forreversenumber
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num, rev=0;
        System.out.println("Enter a number.");
        num=scan.nextInt();
        for(;num!=0;)
        {
           rev = rev*10;
           rev = rev + num%10;
           num = num/10;
        }
        System.out.println("Reverse of a number is = "+rev);
    }
}