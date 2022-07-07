import java.util.*;
public class firstInt
{
    public static void main ()
    {
        Scanner scan = new Scanner (System.in);
       int a,b,c,d,e,f,g;
       System.out.println("Enter first number");
        a= scan.nextInt();
        System.out.println("Enter second number");
        b= scan.nextInt();
        c= a+b;
        d= a-b;
        e= a*b;
        f= a/b;
        g= a%b;
        System.out.println("Addition is = "+c+"\nSubtraction is = "+d+"\nMultiplication is = "+e+"\nDivision is = "+f+"\nModulus is = "+g);
    }
}