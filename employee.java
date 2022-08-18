import java.util.*;
public class employee
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int basic_pay;
        double net_pay, gross_pay, daily_allowance, hra, p_fund;
        System.out.println("Enter basic pay.");
        basic_pay=scan.nextInt();
        daily_allowance=(25*basic_pay)/100;
        hra=(15*basic_pay)/100;
        p_fund=(8.33*basic_pay)/100;
        gross_pay = basic_pay + hra + daily_allowance;
        net_pay = gross_pay - p_fund;
        System.out.println("Your Gross pay is = "+gross_pay);
        System.out.println("Your Net pay is = "+net_pay);
    }
}
