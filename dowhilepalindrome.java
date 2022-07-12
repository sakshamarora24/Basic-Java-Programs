import java.util.*;
public class dowhilepalindrome
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num, rev=0, check=0, num2=0;
        System.out.println("Enter a number.");
        num=scan.nextInt();
        check=num;
        do
        {
           rev = rev*10;
           rev = rev + num%10;
           num = num/10;
        }
        while(num!=0);
        num2=rev;
        System.out.println("Reverse is = "+num2);
        if(num2==check)
        {
           System.out.println("Number is a palindrome ");
        }
        else
        {
            System.out.println("Number is not a palindrome ");
        }
    }
}