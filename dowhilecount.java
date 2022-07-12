import java.util.*;
public class dowhilecount
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num, abc=1;
        System.out.println("Enter a number till counting should go.");
        num=scan.nextInt();
        do
        {
            System.out.println(+abc);
            abc++;
        }
        while(abc<=num);
    }
}