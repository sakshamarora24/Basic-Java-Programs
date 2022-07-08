import java.util.*;//2
public class time
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sec, hr, min, sds, a, b;
        System.out.println("Enter time in seconds.");
        sec = scan.nextInt();
        min=sec/60;
        hr=min/60;
        a=hr*60;
        b=a*60;
        sds=sec-b;
        System.out.println("There are "+hr+"hours , "+min+"minutes and "+sds+"seconds");
    }
}