import java.util.*;
public class leapyear
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        int year;
        System.out.println("Enter a year to check if leap year or not.");
        year = scan.nextInt();
        if(year%4==0)
        {
            System.out.println("The year "+year+" is a leap year.");
        }
        else
        {
            System.out.println("The year "+year+" is not a leap year.");
        }
    }
}