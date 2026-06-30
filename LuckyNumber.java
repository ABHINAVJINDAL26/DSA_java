import java.util.Scanner;

public class LuckyNumber {
    public static int luckyness(int num) {
        int maxnumber=0;
        int minnumber=9;

        while(num>0) {
            int digit = num%10;

            maxnumber = Math.max(maxnumber, digit);
            minnumber = Math.min(minnumber, digit);
            num /= 10;
        }
        return maxnumber - minnumber;
    }
    public static int lucky(int l, int r) {
        int number = l;
        int maxluck=-1;
        for(int i=l;i<=r;i++) {
            int luck = luckyness(i);

            if(luck>maxluck) {
                maxluck=luck;
                number = i;
            }

            if(maxluck==9) break;
        }

        return number;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        
        while (t-->0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(lucky(l, r));
        }
        sc.close();
    }
}