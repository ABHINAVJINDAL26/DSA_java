package TCS;

import java.util.Scanner;

public class PalindromeInRange {
    public static boolean ispalindrome(int num) {
        int original = num;
        int rev=0;

        while(num>0) {
            int ld = num%10;
            rev = (rev*10) + ld;
            num /= 10;
        }

        return original==rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter intial value: ");
        int start = sc.nextInt();
        System.out.print("Enter Final Value: ");
        int end = sc.nextInt();

        System.out.print("Palindrme number in given range");
        for(int i=start;i<=end;i++) {
            if(ispalindrome(i)) {
                System.out.println(i+ " ");
            }
        }

        sc.close();
    }
}
