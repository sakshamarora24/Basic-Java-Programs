import java.util.*;
public class whilesum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sum=0, user;
        System.out.println("Enter a number upto which numbers should add.");
        user=scan.nextInt();
        while(user>=1)
        {
            sum=sum+user;
            user--;
        }
        System.out.println("Sum of numbers is = "+sum);
    }
}