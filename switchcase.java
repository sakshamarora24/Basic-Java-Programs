import java.util.*;
public class switchcase
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int opt, num1, num2, sum, sub, mult, div, mod;
        System.out.println("Enter 2 numbers.");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println("Enter 1 to add numbers.");
        System.out.println("Enter 2 to subtract numbers.");
        System.out.println("Enter 3 to multiply numbers.");
        System.out.println("Enter 4 to divide numbers.");
        System.out.println("Enter 5 to modulus number.");
        opt = scan.nextInt();
        switch (opt)
        {
            case 1:
             {
              sum=num1+num2;
              System.out.println("Addition of numbers is ="+sum);
              break;
             }
            case 2:
             {
              sub=num1-num2;
              System.out.println("Subtraction of numbers is ="+sub);
              break;
             }
            case 3:
             {
              mult=num1*num2;
              System.out.println("Multiplication of numbers is ="+mult);
              break;
             }
            case 4:
             {
              div=num1/num2;
              System.out.println("Division of numbers is ="+div);
              break;
             }
            case 5:
             {
              mod=num1%num2;
              System.out.println("Modulus of numbers is ="+mod);
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