import java.util.*;//17
public class Bankdays
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int days, deposit;
        double amt, ist;
        System.out.println("Enter the amount to be deposited.");
        deposit=scan.nextInt();
        System.out.println("Enter the days in which amount is deposited.");
        days=scan.nextInt();
        if(days<=180)
        {
            ist=(deposit*5.5)/100;
            amt=deposit+ist;
            System.out.println("Matuarity value to be collected = "+amt);
        }
        else if(days<=364 && days>180)
        {
            ist=(deposit*7.5)/100;
            amt=deposit+ist;
            System.out.println("Matuarity value to be collected = "+amt);
        }
        else if(days==365)
        {
            ist=(deposit*9.0)/100;
            amt=deposit+ist;
            System.out.println("Matuarity value to be collected = "+amt);
        }
        else
        {
            ist=(deposit*8.5)/100;
            amt=deposit+ist;
            System.out.println("Matuarity value to be collected = "+amt);
        }
    }
}