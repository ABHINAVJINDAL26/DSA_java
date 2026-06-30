package String;

import java.util.Scanner;

public class PrintSubstring {

    public static String[] printsubstring(String s) {
        int n = s.length();
        int total = n*(n+1) / 2;
        String[]arr = new String[total];

        int index=0;
        for(int start=0;start<n;start++) {
            for(int end=start+1;end<=n;end++) {
                arr[index++] = s.substring(start, end);
            }
        }
        return arr;
    }
    static 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();
        String[]ans= printsubstring(s);
        for(String str: ans) {
            System.out.println(str);
        }
        sc.close();
    }

}
