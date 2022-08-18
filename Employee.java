import java.util.*;
public class employee
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int bp;
        double np, gp, da, hra, pf;
        System.out.println("Enter basic pay.");
        bp=scan.nextInt();
        da=(25*bp)/100;
        hra=(15*bp)/100;
        pf=(8.33*bp)/100;
        gp = bp + hra + da;
        np = gp - pf;
        System.out.println("Your Gross pay is = "+gp);
        System.out.println("Your Net pay is = "+np);
    }
}