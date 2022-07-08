import java.util.*;
public class buzz
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num, rev;
        System.out.println("Enter a number.");
        num=scan.nextInt();
        if(num%7==0)
        {
            System.out.println("Buzz number !!");
        }
        else if(num%10==7)
        {
            System.out.println("Buzz number !!");
        }
        else
        {
            System.out.println("Not a buzz number !!");
        }
    }
}