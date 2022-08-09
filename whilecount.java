import java.util.*;
public class whilecount
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num, abc=1;
        System.out.println("Enter a number.");
        num=scan.nextInt();
        System.out.println("Conting.");
        while(abc<=num)
        {
            System.out.println(+abc);
            abc++;
        }
    }
}