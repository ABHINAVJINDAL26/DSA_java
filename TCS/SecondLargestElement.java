package TCS;

// brute force-> sort array then second last element is second largest element...
// public class SecondLargestElement {
//     public static int slargest(int [] nums) {
//         int n = nums.length;
//         int largest = nums[n-1];

//         for(int i=n-2;i>=0;i--) {
//             if(nums[i] !=largest) return nums[i];
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         // int[] nums = {1,1,1};
//         int [] nums = {1,2,3,4,5};
//         System.out.print("Second Largest Element is: ");
//         System.out.println(slargest(nums));
//     }
// }


// Optimal Approach
public class SecondLargestElement {
    public static int slargest(int [] nums) {
        int n = nums.length;
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for(int num: nums) {
            if(num > largest) {
                slargest = largest;
                largest = num;
            }

            else if(num > slargest  && num != largest) slargest = num;
        }

        if(slargest==Integer.MIN_VALUE) return -1;
        return slargest;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        // int [] nums = {1,2,3,4,5};
        System.out.print("Second Largest Element is: ");
        System.out.println(slargest(nums));
    }
}