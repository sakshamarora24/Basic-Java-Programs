import java.util.*;//19
public class temperature
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int opt;
        double cel, far;
        System.out.println("Enter 1 to convert temperature from celsius to fahrenheit.");
        System.out.println("Enter 2 to convert temperature from fahrenheit to celsius.");
        opt=scan.nextInt();
        switch(opt)
        {
            case 1:
             {
                System.out.println("Enter temperature in celsius");
                cel=scan.nextDouble();
                far=(1.8*cel)+32;
                System.out.println("Temperature in fahrenheit is ="+far);
                break;
             }
            case 2:
             {
                System.out.println("Enter temperature in fahrenheit");
                far=scan.nextDouble();
                cel=(5/9)*(far-32);
                System.out.println("Temperature in celcius is ="+cel);
                break;
             }
            default:
             {
                 System.out.println("Entered a wrong choice!!");
                 break;
             }
        }
    }
}