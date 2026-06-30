package TCS;

public class LargestElement {
    public static int largest(int[]nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    } 

    public static void main(String[] args) {
        int nums[] = {1,3,3,4,5};
        System.out.print("Largest element is: ");
        System.out.println(largest(nums));
    }
}