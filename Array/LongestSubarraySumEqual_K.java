package Array;

import java.util.*;

// Brute force
// public class LongestSubarraySumEqual_K {
//     public static int longestsubarray(int[]nums,int k) {
//         // HashMap<Integer, Integer> map = new HashMap<>();
//         int maxlen = 0;
//         int n= nums.length;
        
//         for(int i=0;i<n;i++) {
//             int sum = 0;
//             for(int j=i;j<n;j++) {
//                 sum += nums[j];

//                 if(sum==k) {
//                     maxlen = Math.max(maxlen, j-i+1);
//                 }
//             }
//         }
//         return maxlen;

//     }

//     public static void main(String[] args) {
//         int [] arr= {1,2,1,1,3};
//         int k = 3;
//         System.out.println("Length of longest subarray sum equal to k is: "+ longestsubarray(arr, k));
//     }
// }


//  Optimal Approach

public class LongestSubarraySumEqual_K {
    public static int longestsubarray(int arr[], int k) {
        int n = arr.length;
        int sum=0, maxlen=0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++) {
            sum += arr[i];

            if(sum==k) {
                maxlen = i+1;
            }

            if(map.containsKey(sum-k)) {
                int len = i - map.get(sum-k);
                maxlen = Math.max(maxlen, len);
            }

            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxlen;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1};
        int k = 3;
        System.out.println("Optimal (HashMap) Answer: " + longestsubarray(arr, k));
    }
}