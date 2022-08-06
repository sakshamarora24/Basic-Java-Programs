import java.util.*;
public class grading
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int marks;
        System.out.println("Enter your marks.");
        marks=scan.nextInt();
        if(marks>80)
        System.out.println("Your grade is = A");
        else if(marks<=80 && marks>70)
        System.out.println("Your grade is = B");
        else if(marks<=70 && marks>60)
        System.out.println("Your grade is = C");
        else if(marks<=60 && marks>50)
        System.out.println("Your grade is = D");
        else
        System.out.println("Your grade is = Fail");
    }
}