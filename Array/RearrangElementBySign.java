package Array;

import java.util.Arrays;

// Brute Force Approach
// import java.util.ArrayList;
// import java.util.Arrays;

// public class RearrangElementBySign {
//     public static int [] rearrange(int[]nums) {
//         int n = nums.length;


//         int [] result = new int[n];
//         ArrayList<Integer> pos = new ArrayList<>();
//         ArrayList<Integer> neg = new ArrayList<>();

//         for(int num: nums) {
//             if(num>0) pos.add(num);
//             else neg.add(num);
//         }

//         int i=0, p=0,ne=0;
//         while(i<n) {
//             result[i++] = pos.get(p++);
//             result[i++] = neg.get(ne++);
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int arr[] = {3,1,-2,-5,2,-4};

//         int[] res = rearrange(arr);
//         System.out.println(Arrays.toString(res));
//     }

// }


// Optimal Approach

public class RearrangElementBySign {
    public static int [] rearrange(int[] arr) {
        int n = arr.length;
        int posindex=0;
        int negindex=1;

        int result[] = new int[n];

        for(int num: arr) {
            if(num > 0) {
                result[posindex] = num;
                posindex += 2;
            } else {
                result[negindex]  = num;
                negindex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[]  = {3,1,-2,-5,2,-4};
        System.out.println("Correct order of elements: "+ Arrays.toString(rearrange(arr)));
    }
}