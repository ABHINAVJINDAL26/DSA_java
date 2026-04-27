package Array;

// brute force approach- create a temp array and store non zero elements in it and then copy back to original array
// public class MoveZeorsToEnd {
//     public void movezeros(int[]nums) {
//         int n = nums.length;

//         int[] temp = new int[n];
//         int index=0;

//         for(int i=0;i<n;i++) {
//             if(nums[i] !=0) {
//                 temp[index++] = nums[i];
//             }
//         }

//         for(int i=0;i<n;i++) {
//             nums[i] = temp[i];
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums = {0, 1, 0, 3, 12};
//         MoveZeorsToEnd obj = new MoveZeorsToEnd();
//         obj.movezeros(nums);
//         for(int i=0;i<nums.length;i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }


// optimal approach- use two pointers, one to keep track of non zero elements and other to traverse the array

public class MoveZeorsToEnd {
    public void movezeros(int[]nums) {
        int n = nums.length;
        int nonzeroindex = 0;

        for(int i=0;i<n;i++) {
            if(nums[i] !=0) {
                int temp = nums[i];
                nums[i] = nums[nonzeroindex];
                nums[nonzeroindex] = temp;
                nonzeroindex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeorsToEnd obj = new MoveZeorsToEnd();
        obj.movezeros(nums);
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i] + " ");
        }
    }
}