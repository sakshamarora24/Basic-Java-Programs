import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        int T;
        String str;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int m = 1; m <= T; m++) {
            str = sc.nextLine();
            int j = 0, c = 0;
            char temp = 0;
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                for (j = 0; j < chars.length; j++) {
                    if (chars[j] == chars[i]) {
                        continue;
                    }
                    if (chars[j] > chars[i]) {
                        temp = chars[i];
                        chars[i] = chars[j];
                        chars[j] = temp;
                        c = c + 1;
                    }
                }
            }
            System.out.println(c);
        }
    }
}