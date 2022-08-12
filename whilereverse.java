import java.util.*;
public class whilereverse
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num, rev=0,mod;
        System.out.println("Enter a number.");
        num=scan.nextInt();
        while(num!=0)
        {
            mod=num%10;
           rev = rev*10+mod;
        
           num = num/10;
        }
        System.out.println("Reverse of a number is = "+rev);
    }
}