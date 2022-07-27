public class pattern7
{
    public static void main(String[] args)
    {
        int rows=9, cols=1;
        for(rows=9;rows>=1;rows=rows-2)
        {
            for(cols=1;cols<=rows;cols=cols)
            {
                System.out.print(cols=cols+2);
            }
            System.out.println();
        }
    }
}