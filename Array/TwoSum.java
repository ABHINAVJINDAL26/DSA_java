package Array;

import java.util.HashMap;

// Brute force 

// public class TwoSum {
//     public static int[] twosum(int[]arr, int target) {
//         int n = arr.length;
        
//         for(int i=0;i<n;i++) {
//             for(int j=i+1;j<n;j++) {
//                 if(arr[i] + arr[j] == target) {
//                     return new int[]{i,j};
//                 }
//             }
//         }

//         return new int[]{-1,-1};
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6};
//         int target = 9;

//         int[] result = twosum(arr, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]);
//     }
// }


// Optimal approach

// public class TwoSum {
//     public static int[] twosum(int []arr, int target) {
//         int n = arr.length;
        
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i=0;i<n;i++) {
//             map.put(arr[i], i);
//         }

//         for(int i=0;i<n;i++) {
//             int complement = target - arr[i];

//             if(map.containsKey(complement) && map.get(complement) != i) {
//                 return new int[] {i, map.get(complement)};
//             }
//         }

//         return new int[]{-1,-1};
//     }

//     public static void main(String[] args) {
//         int [] arr = {2,7,11,15};
//         int target = 9;
     
//         int[] result = twosum(arr, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]);
//     }
// }


// if array is sorted then use two pointer approach

public class TwoSum {
    public static int[] twosum(int nums[], int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15}; // sorted hona chahiye
        int target = 9;

        int[] res = twosum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }
}