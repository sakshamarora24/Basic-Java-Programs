import java.util.*;
public class whilecountback
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num, abc=1;
        System.out.println("Enter a number.");
        num=scan.nextInt();
        System.out.println("Conting.");
        while(num>=abc)
        {
            System.out.println(+num);
            num--;
        }
    }
}