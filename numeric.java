import java.util.*;//
public class numeric
{
    public static void main (String[] args)
    {
       Scanner com = new Scanner (System.in);
       int numb;
       System.out.println("Enter a number to check if positive, negative or zero.");
       numb = com.nextInt();
       if (numb>0)
       {
           System.out.println("Number is positive.");
       }
       else if (numb<0)
       {
            System.out.println("Number is negative.");
       }
       else
       {
            System.out.println("Number is zero.");
       }
    }
}