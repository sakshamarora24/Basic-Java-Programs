public class pattern15
{
    public static void main(String[] args)
    {
        int rows,cols,x=5,spc;
        for(rows=1;rows<=5;rows++)
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
    
    
