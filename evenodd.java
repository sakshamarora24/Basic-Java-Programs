import java.util.*;
public class evenodd
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner (System.in);
        int num1;
        System.out.println("Enter a number.");
        num1 = scan.nextInt();
        //switch(num1)
        //{
         // case 12:
          if(num1%2==0)
          {
             System.out.println(+num1+" is a even number.");
          }
          else
          {
             System.out.println(+num1+" is a odd number.");
            //break;
          }
          //default:
         // System.out.println("Entered wrong choice.");
        //}
    }
}