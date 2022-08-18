import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class salary {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        try {
            Scanner scan = new Scanner(System.in);
            int T;
            T = scan.nextInt();

            for (int i = 1; i <= T; i++) {
                int X, Y, k = 0, num = 0, sal = 0, steak = 0, val = 0, steak1 = 0, steak2 = 0;
                // double num=0.0;
                String s;
                X = scan.nextInt();
                Y = scan.nextInt();
                s = scan.next();
                k = s.length();
                // num=Double.valueOf(s);
                num = Integer.parseInt(s);
                for (int j = 1; j <= k; j++) {
                    // val=(int)(num % (pow(10,j)));
                    val = num % (10 ^ j);
                    if (val == 1) {
                        sal = sal + X;
                        steak1 = steak1 + 1;
                    } else {
                        if (steak2 <= steak1) {
                            steak2 = steak1;
                            steak = steak2;
                            steak = 0;
                        } else {
                            steak = steak2;
                            steak1 = 0;
                        }

                    }
                }

                int amt = sal + (steak * Y);
                System.out.println(amt);
            }

            scan.close();
        } catch (Exception e) {
            return;
        }
    }
}
