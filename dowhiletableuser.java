import java.util.*;
public class dowhiletableuser
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num, abc=1, upto, res;
        System.out.println("Enter a number you want table of.");
        num=scan.nextInt();
        System.out.println("Enter the number you want table upto");
        upto=scan.nextInt();
        System.out.println("Table of "+num);
        do
        {
           res=abc*num;
           System.out.println(+abc+"*"+num+"="+res);
           abc++;  
        }
        while(abc<=upto);
    }
}