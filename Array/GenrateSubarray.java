package Array;

public class GenrateSubarray {
    public static void subarray(int[]nums) {
        int n = nums.length;

        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                for(int k=i;k<=j;k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] nums = {1,2,4};
        subarray(nums);
    }
}
