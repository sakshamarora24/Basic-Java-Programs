import java.util.*;//4
public class pendulum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double lgt, g, time;
        System.out.println("Enter length of pendulum.");
        lgt=scan.nextDouble();
        System.out.println("Enter acceleration due to gravity of pendulum.");
        g=scan.nextDouble();
        time=(2*3.142)*Math.sqrt( lgt/g);
        System.out.println("Time is = "+time+"seconds");
    }
}