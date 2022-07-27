public class pattern9
{
    public static void main(String[] args)
    {
        int rows=5, cols=1;
        for(rows=5;rows>=1;rows--)
        {
            for(cols=1;cols<=rows;cols++)
            {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}