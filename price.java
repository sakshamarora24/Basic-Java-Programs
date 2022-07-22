import java.util.*;//11
public class price
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        double cp, sp, prf, pfprc, loss, lsprc;
        System.out.println("Enter the cost price of object.");
        cp = scan.nextDouble();
        System.out.println("Enter the selling price of object.");
        sp = scan.nextDouble();
        if (sp>cp)
        {
            prf = sp-cp;
            System.out.println("Profit is ="+prf);
            pfprc = (prf/cp)*100;
            System.out.println("Profit percent is ="+pfprc);
        }
        else
        {
            loss = cp-sp;
            System.out.println("Loss is ="+loss);
            lsprc = (loss/cp)*100;
            System.out.println("Loss percent is ="+lsprc);
        }
    }
}