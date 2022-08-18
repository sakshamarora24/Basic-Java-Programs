import java.util.*;
public class prime
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int range,num,num1,ec=0;
        System.out.println("Enter range you want to find prime numbers upto.");
        range=scan.nextInt();
        for(num=2;num<=range;num++)
        {
            int count=0;
            for(num1=1;num1<=num;num1++)
            {
                if(num%num1==0)
                {
                    count=count+1;
                }
            }
            if(count==2)
            {
                System.out.println(num);
                ec=ec+1;
            }
        }
        System.out.println("Total numbers of prime numbers printed are :"+ec);
    }
}