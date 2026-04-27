package Array;

import java.util.HashMap;

// Brute Force
// public class SubarraySumEqual_K {
//     public static int subarraysum(int [] arr, int k) {
//         int n = arr.length;
//         int count=0;

//         for(int i=0;i<n;i++) {
//             int sum=0;
//            for(int j=i;j<n;j++) {
//             sum += arr[j];

//             if(sum==k) count++;
//            } 
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,1,2,1};
//         int k =3;

//         System.out.println("Subarray sum length "+ k + " is: "+ subarraysum(arr,k));
//     }
// }


// Optimal approach

public class SubarraySumEqual_K {
    public static int subarraycount(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n =arr.length;
        int count=0,sum=0;
        map.put(0,1);

        for(int i=0;i<n;i++) {
            sum += arr[i];

            if(map.containsKey(sum-k)) {
                count += map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum, 0) +1);
        }

        return count;
    }

    public static void main(String[] args) {
       int arr[] = {1,2,1,2,1};
       int k =3;

        System.out.println("Subarray sum length "+ k + " is: "+ subarraycount(arr,k));
    }
}