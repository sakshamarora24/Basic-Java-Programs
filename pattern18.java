public class pattern18
{
    public static void main()
    {
        int rows,cols,x=5,spc;
        for(rows=5;rows>=1;rows--)
        {
            
             for(spc=x-1;spc>=rows;spc--)
             {
                 System.out.print(" ");
             }
            
             for(cols=rows;cols>=1;cols--)
             {
                 System.out.print(cols);
             }
            
             System.out.println();
        }
   }
}
    
    
