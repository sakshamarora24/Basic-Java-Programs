import java.util.*;
public class forevencount
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
          for(;num>=1;num=num-2)
          {
             System.out.println(num);
          }
          System.out.println("There are "+res+" even numbers");
         }
         else
         {
          num=num-1;
          res=(num/2);
          for(;num>=1;num=num-2)
          {
             System.out.println(num);
          }
          System.out.println("There are "+res+" even numbers");  
          }
    }
}