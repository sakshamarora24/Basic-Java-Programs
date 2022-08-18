import java.util.*;
public class students
{
    public static void main (String args[])
    {
        Scanner yes = new Scanner (System.in);
        System.out.println("Enter marks of five subjects.(Out of 100)");
        double marks1, marks2, marks3, marks4, marks5, tot, per;
        marks1 =yes.nextDouble();
        marks2 =yes.nextDouble();
        marks3 =yes.nextDouble();
        marks4 =yes.nextDouble();
        marks5 =yes.nextDouble();
        tot =marks1+marks2+marks3+marks4+marks5;
        per = (tot/500)*100;
        System.out.println("Your percentage of 5 subjects is ="+per);
    }
}