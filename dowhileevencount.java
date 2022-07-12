import java.util.*;
public class dowhileevencount
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int num, res;
        System.out.println("Enter a number you want even numbers upto.");
        num=scan.nextInt();
        System.out.println("Even numbers.");
        if(num%2==0)
        {
          res=(num/2);
          do
          {
             System.out.println(num);
             num=num-2;
          }
          while(num>=1);
          System.out.println("There are "+res+" even numbers");
         }
         else
         {
          num=num-1;
          res=(num/2);
          do
          {
             System.out.println(num);
             num=num-2;
          }
          while(num>=1);
          System.out.println("There are "+res+" even numbers");  
          }
    }
}