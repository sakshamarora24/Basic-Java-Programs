import java.util.*;
public class vowel
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner (System.in);
        char x;
        System.out.println("Enter an alphabet.");
        x = scan.next().charAt(0);
        switch(x)
        {
        case 'a':
         {
           System.out.println("Your alphabet is vowel");
           break;
         }
        case 'e':
         {
           System.out.println("Your alphabet is vowel");
           break;
         }
        case 'i':
         {
           System.out.println("Your alphabet is vowel");
           break;
         }
        case 'o':
         {
           System.out.println("Your alphabet is vowel");
           break;
         }
        case 'u':
         {
           System.out.println("Your alphabet is vowel");
           break;
         }
        default:
         {
           System.out.println("Your alphabet is a consonant");
           break;
         }
     }
  }
}