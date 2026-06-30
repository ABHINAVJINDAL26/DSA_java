import java.util.Arrays;
import java.util.Scanner;

public class DistinctSplit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0) {
            int length = sc.nextInt();
            String str = sc.next();

            int[]prefix = new int[length];
            int[]suffix = new int[length];

            boolean[]freq = new boolean[256];
            int count=0;

            for(int i=0;i<length;i++) {
                int index = str.charAt(i);

                if(!freq[index]) {
                    freq[index] = true;
                    count++;
                }

                prefix[i] = count;
            }

            Arrays.fill(freq, false);
            count=0;

            for(int i=length-1;i>=0;i--) {
                int index = str.charAt(i);

                if(!freq[index]) {
                    freq[index] = true;
                    count++;
                }

                suffix[i] = count;
            }

            int ans=0;
            for(int i=0;i<length-1;i++) {
                ans = Math.max(ans, prefix[i] + suffix[i+1]);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
