public class patternstar
{
    public static void main(String[] args)
    {
        int rows=1, cols=1;
        for(rows=1;rows<=5;rows++)
        {
            for(cols=1;cols<=rows;cols++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}