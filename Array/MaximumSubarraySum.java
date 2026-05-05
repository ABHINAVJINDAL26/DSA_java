package Array;

// public class MaximumSubarraySum {
//     public static int maxsubarray(int[]nums) {
//         int n = nums.length;

//         int maxsum = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++) {
//             int sum =0;

//             for(int j=i;j<n;j++) {
//                 sum += nums[j];
//                 maxsum = Math.max(sum, maxsum);
//             }
//         }

//         return maxsum;
//     }

//     public static void main(String[] args) {
//         int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
//         System.out.println("Maximum subarray sum: "+ maxsubarray(nums));
//     }
// }

// Optimal Approach using -> Kadane algorithm
// public class MaximumSubarraySum {
//     public static int maxsum(int nums[]) {
//         // int n= nums.length;

//         int maxsum = Integer.MIN_VALUE;
//         int currentsum = 0;

//         for(int num : nums) {
//             currentsum += num;
//             maxsum = Math.max(maxsum, currentsum);

//             if(currentsum<0) currentsum=0;
//         }

//         return maxsum;
//     }

//     public static void main(String[] args) {
//         int nums[]  = {-2,1,-3,4,-1,2,1,-5};
//         System.out.println("Maximum subarray sum is: "+ maxsum(nums));
//     }
// }




// ydi vo subarray print krna h to 

public class MaximumSubarraySum {
    public static int maxsubarray(int[]nums) {
        int maxsum = Integer.MIN_VALUE, currentsum = 0;
        int tempstart =0, start=0, end=0;

        for(int i=0;i<nums.length;i++) {
            currentsum += nums[i];

            if(currentsum>maxsum) {
                maxsum = currentsum;
                start = tempstart;
                end = i;
            }

            if(currentsum<0) {
                currentsum=0;
                tempstart = i+1;
            }
        }

        System.out.print("Maximum subarray is: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        return maxsum;
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5};
        
        System.out.println("Maximum subarray sum is: "+ maxsubarray(nums));

    }
}