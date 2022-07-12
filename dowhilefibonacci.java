import java.util.*;
public class dowhilefibonacci
{
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     int num1=0, num2=1, sum=0, p;
     System.out.println("Enter number you want fibonacci series of how many numbers.");
     p=scan.nextInt();
     do
     {
         System.out.print(sum+"\t");
         num1=num2;
         num2=sum;
         sum=num1+num2;
         p--;
     }
     while(p>=1);
     }
 }