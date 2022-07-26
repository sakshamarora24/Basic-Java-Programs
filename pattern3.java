public class pattern3
{
    public static void main(String[] args)
    {
        int rows=1, cols=5;
        for(rows=1;rows<=5;rows++)
        {
            for(cols=5;cols>=rows;cols--)
            {
                System.out.print(cols);
            }
            System.out.println();
        }
    }
}