import java.io.*;
class array
{
    private int a[] = new int[10];
    private int b[] = new int[10];
    public void getlist()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        for(int j=0;j<10;j++)
        {
            a[j]=Integer.parseInt(in.readLine());
            b[j]=Integer.parseInt(in.readLine());
        }
    }
    int sum(int x, int y)
    {
        int z = x + y;
        return(z);
    }
    int max(int x, int y)
    {
        int z;
        z=(x>y) ? x:y;
        return(z);
    }
    void display()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Sum of corresponding numbers"+sum(a[i],b[i]));
            System.out.println("Maximum of corresponding nos."+max(a[i],b[i]));
        }
    }
}
