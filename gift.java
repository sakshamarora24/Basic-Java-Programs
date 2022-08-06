import java.util.*;//15
public class gift
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        double dis, cost, amt;
        System.out.println("Enter total cost of shopping.");
        cost=scan.nextDouble();
        if(cost<=2000)
        {
            dis=(cost*5)/100;
            amt=cost-dis;
            System.out.println("Amount to be paid = "+amt);
            System.out.println("Your gift is a Calculator!!");
        }
        else if(cost<=5000 && cost>2000)
        {
            dis=(cost*10)/100;
            amt=cost-dis;
            System.out.println("Amount to be paid = "+amt);
            System.out.println("Your gift is a School Bag!!");
        }
        else if (cost<=10000 && cost>5000)
        {
            dis=(cost*15)/100;
            amt=cost-dis;
            System.out.println("Amount to be paid = "+amt);
            System.out.println("Your gift is a Wall Clock!!");
        }
        else
        {
            dis=(cost*20)/100;
            amt=cost-dis;
            System.out.println("Amount to be paid = "+amt);
            System.out.println("Your gift is a Wrist Watch!!");
        }
    }
}