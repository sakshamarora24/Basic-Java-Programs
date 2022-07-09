import java.util.*;
public class foroddcount
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int num, res;
        System.out.println("Enter a number you want odd numbers upto.");
        num=scan.nextInt();
        System.out.println("Odd numbers.");
        if(num%2==1)
        {
          res=(num/2);
          res=res+1;
          for(;num>=1;num=num-2)
          {
             System.out.println(num);
          }
          System.out.println("There are "+res+" odd numbers");
         }
         else
         {
          num=num-1;
          res=(num/2);
          res=res+1;
          for(;num>=1;num=num-2)
          {
             System.out.println(num);
          }
          System.out.println("There are "+res+" odd numbers");  
          }
    }
}