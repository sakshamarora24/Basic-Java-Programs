import java.util.*;
public class forfactorial
{
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     int num, res=1;
     for(num=4;num>=1;num--)
     { res=res*num;
      }
      System.out.println("Factorial of 4 is = "+res);
     }
 }