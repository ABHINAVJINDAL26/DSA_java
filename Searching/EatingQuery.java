package Searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EatingQuery {
    public static int lowerbound(long[] prefix, long target) {
        int low=0;
        int high=prefix.length-1;
        int ans = prefix.length;

        while(low<=high) {
            int mid = low + (high-low)/2;

            if(prefix[mid] >= target) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            Integer[]arr = new Integer[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr, Collections.reverseOrder());

            long[]prefix = new long[n];
            prefix[0] = arr[0];

            for(int i=1;i<n;i++) {
                prefix[i] = prefix[i-1] + arr[i];
            }

            while(q-->0) {
                long x = sc.nextLong();
                int index = lowerbound(prefix, x);

                if(index==n) {
                    System.out.println(-1);
                } else {
                    System.out.println(index+1);
                }
            }
        }
    }
}
