package Array;

// brute force approach- check for each number from 0 to n if it is present in the array or not
// public class MissingNumber {
//     public int missingnumber(int arr[]) {
//         int n = arr.length;
//         for(int i=0;i<=n;i++) {
//             boolean found = false;
//             for(int j=0;j<n;j++) {
//                 if(arr[j] == i) {
//                     found = true;
//                     break;
//                 }
//             }
//             if(!found) {
//                 return i;
//             }
//         }
//         return -1; // This line will never be reached if the input is valid
//     }
// }

// optimal approach- use the formula for sum of first n natural numbers and subtract the sum of elements in the array from it to get the missing number

public class MissingNumber {
    public int missingnumber(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += arr[i];
        }
        int totalsum = n*(n+1)/2;
        return totalsum - sum;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 4, 5};
        MissingNumber obj = new MissingNumber();
        System.out.println("Missing number is: " + obj.missingnumber(arr));
    }
}