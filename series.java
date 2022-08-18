import java.io.*;
public class series
{
public static void main(String args[])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int a,y,n;
System.out.println("Enter the number for how many times to print a!");
n = Integer.parseInt(in.readLine());
for(a=1;a<=n;a++)
{
for(y=1;y<=a;y++)
System.out.print("a");
System.out.println("");
}
}
}