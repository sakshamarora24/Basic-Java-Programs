import java.util.*;//9
public class divisible
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter a number.");
        num=scan.nextInt();
        if(num%3==0 && num%5==0)
        {
            System.out.println(+num+" is divisible by 3 as well as 5.");
        }
        else if(num%3==0 && num%5!=0)
        {
            System.out.println(+num+" is divisible by 3 but not by 5.");
        }
        else if(num%3!=0 && num%5==0)
        {
            System.out.println(+num+" is not divisible by 3 but divisible by 5.");
        }
        else
        {
            System.out.println(+num+" is not divisible by 3 and not by 5.");
        }
    }
}