public class pattern13
{
    public static void main(String[] args)
    {
       int rows,cols,x;
       for(rows=5;rows>=1;rows--)
       {
            
            for(x=rows-1;x>=1;x--)
            {
                System.out.print(" ");
            }
            
            for(cols=rows;cols<=5;cols++)
            {
                System.out.print(cols);
            }
            System.out.println();
       }
   }
}
    
    
