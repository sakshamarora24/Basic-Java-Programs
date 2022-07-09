import java.util.*;
public class forsum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sum=0, num;
        for(num=1;num<=10;num++)
        {
            sum=sum+num;
        }
        System.out.println("Sum of first 10 numbers is ="+sum);
    }
}