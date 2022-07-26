public class pattern6
{
    public static void main(String[] args)
    {
        int rows=1, cols=1;
        for(rows=1;rows<=9;rows=rows+2)
        {
            for(cols=1;cols<=rows;cols=cols+2)
            {
                System.out.print(cols);
            }
            System.out.println();
        }
    }
}