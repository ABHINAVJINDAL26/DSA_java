package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Brute Force
// public class LeadersArray {
//     public static List<Integer> leaders(int [] nums) {
//         int n = nums.length;

//         ArrayList<Integer> result = new ArrayList<>();
//         for(int i=0;i<n;i++) {

//             boolean isleader = true;

//             for(int j=i+1;j<n;j++) {
//                 if(nums[j] > nums[i]) {
//                     isleader = false;
//                     break;
//                 }
//             }
            
//             if(isleader) result.add(nums[i]);
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int nums[] = {16,17,4,3,5,2};
        
//         System.out.println("Leaders Are: "+ leaders(nums));
//     }
// }


// Optimal Approach

public class LeadersArray {
    public static List<Integer> leaders(int[]nums) {
        int n = nums.length;

        int maxright = Integer.MIN_VALUE;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=n-1;i>=0;i--) {
            if(nums[i] > maxright)  {
                result.add(nums[i]);
                maxright = nums[i];
            }
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {16,17,4,3,5,2};
        System.out.println("Leaders Are: "+ leaders(nums));
    }
}