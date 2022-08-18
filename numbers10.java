/* This is very basic approach using if alse to count positive and negative numbers
   There can be more approaches using for loop, arrays, function call, etc.
*/
import java.util.*;
public class numbers10
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,count=0,negco=0,sum=0,dum=0;
        System.out.println("Enter 10 integers.");
        num1=scan.nextInt();
        num2=scan.nextInt();
        num3=scan.nextInt();
        num4=scan.nextInt();
        num5=scan.nextInt();
        num6=scan.nextInt();
        num7=scan.nextInt();
        num8=scan.nextInt();
        num9=scan.nextInt();
        num10=scan.nextInt();
        if(num1>0)
        {
           count=count+1;
           sum=sum+num1;
        }
        else
        {
            negco=negco+1;
            dum=dum+num1;
        }
        if(num2>0)
        {
           count=count+1;
           sum=sum+num2;
        }
        else
        {
            negco=negco+1;
            dum=dum+num2;
        }
        if(num3>0)
        {
           count=count+1;
           sum=sum+num3;
        }
        else
        {
            negco=negco+1;
            dum=dum+num3;
        }
        if(num4>0)
        {
           count=count+1;
           sum=sum+num4;
        }
        else
        {
            negco=negco+1;
            dum=dum+num4;
        }
        if(num5>0)
        {
           count=count+1;
           sum=sum+num5;
        }
        else
        {
            negco=negco+1;
            dum=dum+num5;
        }
        if(num6>0)
        {
           count=count+1;
           sum=sum+num6;
        }
        else
        {
            negco=negco+1;
            dum=dum+num6;
        }
        if(num7>0)
        {
           count=count+1;
           sum=sum+7;
        }
        else
        {
            negco=negco+1;
            dum=dum+num7;
        }
        if(num8>0)
        {
           count=count+1;
           sum=sum+num8;
        }
        else
        {
            negco=negco+1;
            dum=dum+num8;
        }
        if(num9>0)
        {
           count=count+1;
           sum=sum+num9;
        }
        else
        {
            negco=negco+1;
            dum=dum+num9;
        }
        if(num10>0)
        {
           count=count+1;
           sum=sum+num10;
        }
        else
        {
            negco=negco+1;
            dum=dum+num10;
        }
        System.out.println("Total positive integers are ="+count);
        System.out.println("Sum of positive numbers is ="+sum);
        System.out.println("Total negative integers are ="+negco);
        System.out.println("Sum of negative numbers is ="+dum);
    }
}
