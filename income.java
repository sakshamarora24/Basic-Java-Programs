import java.util.*;//16
public class income
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        double inc, tax;
        System.out.println("Enter your income.");
        inc = scan.nextDouble();
        if (inc<=160000)
        {
            tax = 0;
            System.out.println ("Your tax is  ="+tax);
        }
        else if (inc>160000 && inc<=500000)
        {
            tax = (10*inc)/100;
            System.out.println ("Your tax is  ="+tax);
        }
        else if (inc>500000&&inc<=800000)
        {
            tax = (20*inc)/100+34000;
            System.out.println ("Your tax is  ="+tax);
        }
        else
        {
            tax = (30*inc)/100+94000;
            System.out.println ("Your tax is  ="+tax);
        }
    }
}