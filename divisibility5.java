import java.util.*;
public class divisibility5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num1,num2,num3,num4,num5,count=0;
        System.out.println("Enter 5 integers.");
        num1=scan.nextInt();
        num2=scan.nextInt();
        num3=scan.nextInt();
        num4=scan.nextInt();
        num5=scan.nextInt();
        if(num1%5==0)
        {
            if(num1%10==5)
            {
                //System.out.println(num1);
                System.out.println("Number ending 5 :"+num1);
            }
            else
            {
                count=count+1;
            }
        }
        else
        {
            System.out.println(num1+" is not divisible by 5.");
        }
        if(num2%5==0)
        {
            if(num2%10==5)
            {
                //System.out.println(num2);
                System.out.println("Number ending 5 :"+num2);
            }
            else
            {
                count=count+1;
            }
        }
        else
        {
            System.out.println(num2+" is not divisible by 5.");
        }
        if(num3%5==0)
        {
            if(num3%10==5)
            {
                //System.out.println(num3);
                System.out.println("Number ending 5 :"+num3);
            }
            else
            {
                count=count+1;
            }
        }
        else
        {
            System.out.println(num3+" is not divisible by 5.");
        }
        if(num4%5==0)
        {
            if(num4%10==5)
            {
                //System.out.println(num4);
                System.out.println("Number ending 5 :"+num4);
            }
            else
            {
                count=count+1;
            }
        }
        else
        {
            System.out.println(num4+" is not divisible by 5.");
        }
        if(num5%5==0)
        {
            if(num5%10==5)
            {
                //System.out.println(num5);
                System.out.println("Number ending 5 :"+num5);
            }
            else
            {
                count=count+1;
            }
        }
        else
        {
            System.out.println(num5+" is not divisible by 5.");
        }
        System.out.println("Numbers ending with 0(zero) are :"+count);
    }
}