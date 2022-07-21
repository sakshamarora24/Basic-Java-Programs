import java.util.*;//6
public class mathsfunction
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int opt;
        double res, num;
        System.out.println("Enter 1 to find natural logarithm.");
        System.out.println("Enter 2 to find absolute value.");
        System.out.println("Enter 3 to find square root.");
        System.out.println("Enter 4 to find cube.");
        opt=scan.nextInt();
        switch(opt)
        {
            case 1:
             {
                System.out.println("Enter 1 number.");
                num=scan.nextInt();
                res=Math.log(num);
                System.out.println("Logarithm of number is = "+res);
                break;
             }
             case 2:
             {
                System.out.println("Enter 1 number.");
                num=scan.nextInt();
                res=Math.abs(num);
                System.out.println("Absolute value of number is = "+res);
                break;
             }
             case 3:
             {
                System.out.println("Enter 1 number.");
                num=scan.nextInt();
                res=Math.sqrt(num);
                System.out.println("Square root of number is = "+res);
                break;
             }
             case 4:
             {
                System.out.println("Enter 1 number.");
                num=scan.nextInt();
                res=num*num*num;
                System.out.println("Cube of number is = "+res);
                break;
             }
             default:
             {
                 System.out.println("Wrong choice !!");
             }
        }
    }
}