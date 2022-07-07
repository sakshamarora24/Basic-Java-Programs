import java.util.*;
public class thirdDouble
{
    public static void main (String args [])
    {
        Scanner scan = new Scanner (System.in);
       double a,b,c=0,d=0,e=0,f=0,g;
       System.out.println("Enter first number");
        a= scan.nextDouble();
        System.out.println("Enter second number");
        b= scan.nextDouble();
       c= a+b;
        d= a-b;
        e= a*b;
        f= a/b;
        g= a%b;
        System.out.println("Addition is= "+c+"\tSubtraction is= "+d+"\nMultiplication is= "+e+"\tDivision is= "+f+"\nModulus is= "+g);
        }
}