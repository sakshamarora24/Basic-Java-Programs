public class pattern10 
{
    public static void main(String[] args)
    {
        int rows=1, cols=1;
        for(rows=1;rows<=5;rows++)
        {
            for(cols=1;cols<=rows;cols++)
            {
                if(cols%2!=0)
               {
                  System.out.print("1");
               }
               else
               {
                  System.out.print("0");
               }
            }
            System.out.println();
        }
    }
}