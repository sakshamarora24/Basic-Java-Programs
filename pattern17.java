public class pattern17
{
    public static void main(String[] args)
    {
        int rows,cols,x=5,spc;
        for(rows=1;rows<=5;rows++)
        {
            
             for(spc=rows-1;spc>=1;spc--)
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
    
    
