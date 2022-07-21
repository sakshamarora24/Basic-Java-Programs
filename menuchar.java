import java.util.*;
public class menuchar
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char opt;
        int num1, num2, sum, sub, mult, div, mod;
        System.out.println("Enter 2 numbers.");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println("Enter 'a' to add numbers.");
        System.out.println("Enter 's' to subtract numbers.");
        System.out.println("Enter 'm' to multiply numbers.");
        System.out.println("Enter 'd' to divide numbers.");
        opt = scan.next().charAt(0);
        switch (opt)
        {
            case 'a':
             {
              sum=num1+num2;
              System.out.println("Addition of numbers is ="+sum);
              break;
             }
            case 's':
             {
              sub=num1-num2;
              System.out.println("Subtraction of numbers is ="+sub);
              break;
             }
            case 'm':
             {
              mult=num1*num2;
              System.out.println("Multiplication of numbers is ="+mult);
              break;
             }
            case 'd':
             {
              div=num1/num2;
              System.out.println("Division of numbers is ="+div);
              break;
             }
            default:
             {
              System.out.println("Entered a wrong choice.");
              break;
             }
        }
    }
}