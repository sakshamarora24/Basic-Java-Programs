import java.util.*;
public class dowhilecountback
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num, abc=1;
        System.out.println("Enter a number.");
        num=scan.nextInt();
        do
        {
            System.out.println(+num);
            num--;
        }
        while(num>=abc);
    }
}