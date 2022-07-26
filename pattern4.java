public class pattern4
{
    public static void main(String[] args)
    {
        int rows=5, cols=5;
        for(rows=5;rows>=1;rows--)
        {
            for(cols=5;cols>=rows;cols--)
            {
                System.out.print(cols);
            }
            System.out.println();
        }
    }
}