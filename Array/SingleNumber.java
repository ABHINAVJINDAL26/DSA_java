package Array;

// public class SingleNumber {
//     public static int singlenumber(int arr[] ) {
//         int n = arr.length;
        
//         for(int i=0;i<n;i++) {
//             int count=0;
//             for(int j=0;j<n;j++) {
//                 if(arr[i]==arr[j]) {
//                     count++;
//                 }
//             }
//             if(count==1) {
//                 return arr[i];
//             }
//         }
//         return -1;
//     }
// }


// optimal approach using bit manipulation

public class SingleNumber {
    public static int singlenumber(int[]nums) {
        int xor = 0;

        for(int num: nums) {
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,1,3,4};
        System.out.println("Single number is: "+ singlenumber(arr));
    }
}