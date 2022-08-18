import java.util.*;//3
public class interest
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      int pcl, rate, time;
      double a, b, oney, twoy, threey;
      System.out.println("Enter principle");
      pcl=scan.nextInt();
      System.out.println("Enter rate");
      rate=scan.nextInt();
      System.out.println("Enter time (between 1 to 3 years.)");
      time=scan.nextInt();
      switch(time)
      {
           case 1:
            {
            oney = (pcl*rate*1)/100;
            System.out.println("Interest for 1st year ="+oney);
            break;
           }
           case 2:
           {
            oney = (pcl*rate*1)/100;
            System.out.println("Interest for 1st year ="+oney);
            a = pcl+oney;
            twoy = (a*rate*1)/100;
            System.out.println("Interest for 2nd year ="+twoy);
            break;
           }
           case 3:
           {
            oney = (pcl*rate*1)/100;
            System.out.println("Interest for 1st year ="+oney);
            a = pcl+oney;
            twoy = (a*rate*1)/100;
            System.out.println("Interest for 2nd year ="+twoy);
            b = a+twoy;
            threey = (b*rate*1)/100;
            System.out.println("Interest for 3rd year ="+threey);
            break;
           }
           default:
           {
            System.out.println("Entered wrong number of years.");
            break;
           }
      }
      }
  }