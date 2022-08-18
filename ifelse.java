import java.util.*;
public class ifelse
{
    public static void main (String[] args)
    {
      Scanner scan = new Scanner (System.in);
      int num;
      System.out.println("Enter an integer.");
      num =scan.nextInt();
      if (num==1)
      {
        System.out.println("If block");
      }
      else if (num==2)
      {
        System.out.println("1st Else if block");  
      }
      else if (num==3)
      {
        System.out.println("2nd Else if block");
      }
      else
      {
        System.out.println("Else block");
      }
    }
}