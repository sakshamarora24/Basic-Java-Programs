import java.util.*;
public class fortable
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num, count=13, tab;
       System.out.println("Table of 13");
        for(num=0;num<=10;num++)
        {
            tab=num*count;
            System.out.println(+num+"*"+count+"="+tab);
        }
    }
}