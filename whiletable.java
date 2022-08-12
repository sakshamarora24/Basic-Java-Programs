import java.util.*;
public class whiletable
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num, abc=1, res;
        System.out.println("Enter a number you want table of.");
        num=scan.nextInt();
        System.out.println("Table of "+num);
        while(abc<=10)
        {
            res=abc*num;
            System.out.println(abc+"*"+num+"="+res);
            abc++;
        }
    }
}