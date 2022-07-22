import java.util.*;//18
public class policy
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        double dct, comm, sum, amt;
        String name;
        System.out.print("Name of the policy holder (enter your name) :");name=scan.nextLine();
        System.out.print("Sum assured (enter the sum of policy) :");sum=scan.nextDouble();
        if(sum<=100000)
        {
            dct=(sum*5)/100;
            amt=sum-dct;
            comm=(amt*2)/100;
            //System.out.print("Name of the policy holder :"+name);
            //System.out.print("Sum assured :"+sum);
            System.out.println("Premium :"+amt);
            System.out.println("Discount on the premium :"+dct);
            System.out.println("Commision of the agent :"+comm);
        }
        else if(sum<=200000 && sum>100000)
        {
            dct=(sum*8)/100;
            amt=sum-dct;
            comm=(amt*3)/100;
            //System.out.print("Name of the policy holder :"+name);
            //System.out.print("Sum assured :"+sum);
            System.out.println("Premium :"+amt);
            System.out.println("Discount on the premium :"+dct);
            System.out.println("Commision of the agent :"+comm);
        }
        else if(sum<=500000 && sum>200000)
        {
            dct=(sum*10)/100;
            amt=sum-dct;
            comm=(amt*5)/100;
            //System.out.print("Name of the policy holder :"+name);
            //System.out.print("Sum assured :"+sum);
            System.out.println("Premium :"+amt);
            System.out.println("Discount on the premium :"+dct);
            System.out.print("Commision of the agent :"+comm);
        }
        else
        {
            dct=(sum*15)/100;
            amt=sum-dct;
            comm=(amt*7.5)/100;
            //System.out.print("Name of the policy holder :"+name);
            //System.out.print("Sum assured :"+sum);
            System.out.print("Premium :"+amt);
            System.out.print("Discount on the premium :"+dct);
            System.out.print("Commision of the agent :"+comm);
        }
    }
}