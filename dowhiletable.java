import java.util.*;
public class dowhiletable
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num, abc=1, res=0;
        System.out.println("Enter a number you want table of.");
        num=scan.nextInt();
        System.out.println("Table of "+num);
        do
        {
            res=abc*num;
            System.out.println(+abc+"*"+num+"="+res);
            abc++;
        }
        while(abc<=10);
    }
}