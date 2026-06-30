package TCS;

import java.util.Arrays;

public class ArrayMedian {
    public static double findmedian(int[]nums) {
        Arrays.sort(nums);
        int n = nums.length;

        if(n%2==1) {
            return nums[n/2];
        } else {
            return (nums[n/2] + nums[n/2-1]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[]nums = {1,2,4,5};
        System.out.println("Median is: "+ findmedian(nums));
    }
}
