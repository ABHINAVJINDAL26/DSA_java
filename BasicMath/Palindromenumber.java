package BasicMath;

public class Palindromenumber {
    public static void main(String[] args) {
        int num = 12321;
        int originalNum = num;
        int reversed = 0;

        while(num>0) {
            int digit = num%10;
            reversed  = reversed*10 + digit;
            num = num/10;
        }

        if(reversed == originalNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }
    }
}
