import java.util.*;
public class dowhilesum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sum=0, user;
        System.out.println("Enter a number upto which numbers should add.");
        user=scan.nextInt();
        do
        {
            sum=sum+user;
            user--;
            System.out.println("Sum of numbers is = "+sum);
        }
        while(user>=1);
        System.out.println("Sum of numbers is = "+sum);
    }
}