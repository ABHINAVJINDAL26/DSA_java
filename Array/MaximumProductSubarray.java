package Array;


// Brute Force Approach
// public class MaximumProductSubarray {
//     public static int maxproduct(int nums[]) {
//         int n = nums.length;

//         int maxproduct = Integer.MIN_VALUE;

//         for(int i=0;i<n;i++) {
//             int product = 1;

//             for(int j=i;j<n;j++) {
//                 product *= nums[j];

//                 maxproduct = Math.max(product, maxproduct);
//             }
//         }

//         return maxproduct;
//     }

//     public static void main(String[] args) {
//         int nums[] = {-2, 6, -3, -10, 0, 2};
//         System.out.println("Maximum product subarray is: "+ maxproduct(nums));
//     }
// }


// Optimal Approach

public class MaximumProductSubarray {
    public static int maxproduct(int[]nums) {
        
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for(int i=1;i<nums.length;i++) {
            int num = nums[i];

            if(num<0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(num, max*num);
            min = Math.min(num, min*num);

            result = Math.max(max, result);
        }

        return result;
    }


    public static void main(String[] args) {
        int arr[] = {-2, 6, -3, -10, 0, 2};

        System.out.println("Maximum product subarray is: "+ maxproduct(arr));
    }
}