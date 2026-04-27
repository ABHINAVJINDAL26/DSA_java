package Array;
import java.util.*;


// brute force approach- create a set and add all elements of both arrays to it, then convert the set to a

public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> union(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        Set<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++) {
            set.add(arr1[i]);
        }
        for(int j=0;j<m;j++) {
            set.add(arr2[j]);
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};

        ArrayList<Integer> result = union(arr1, arr2);
        System.out.println("Union of the two sorted arrays: " + result);
    }
}


// optimal approach- use two pointers to traverse both arrays and add unique elements to the result list

// public class UnionOfTwoSortedArrays {
//     public static ArrayList<Integer> union(int arr1[], int arr2[]) {
//         int n = arr1.length;
//         int m = arr2.length;

//         int i=0,j=0;

//         ArrayList<Integer> ans = new ArrayList<>();

//         while(i<n && j<m) {
//             if(arr1[i] < arr2[j]) {
//                 if(ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]) {
//                     ans.add(arr1[i]);
//                 }
//                 i++;
//             }
//             else if(arr1[i] > arr2[j]) {
//                 if(ans.size() == 0 || ans.get(ans.size() - 1) != arr2[j]) {
//                     ans.add(arr2[j]);
//                 }
//                 j++;
//             }
//             else {
//                 if(ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]) {
//                     ans.add(arr1[i]);
//                 }
//                 i++;
//                 j++;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr1[] = {1, 2, 4, 5, 6};
//         int arr2[] = {2, 3, 5, 7};

//         ArrayList<Integer> result = union(arr1, arr2);
//         System.out.println("Union of the two sorted arrays: " + result);
//     }
// }
