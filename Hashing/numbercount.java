package Hashing;

// using brute force method to find the count of a number in O(n) time
// public class numbercount {
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 3,5,5,1,3,2,1,1,1};
//         int n = arr.length;
//         int num = 3;
//         int count = 0;
//         for(int i = 0; i < n; i++){
//             if(arr[i] == num){
//                 count++;
//             }
//         }
//         System.out.println(num + " occurs " + count + " times");
//     } 
// }


// using precomputed count array to find the count of a number in O(1) time
// public class numbercount {
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 3,5,5,1,3,2,1,1,1};
//             int n = arr.length;
//             int count[] = new int[100];
//             for(int i = 0; i < n; i++){
//                 count[arr[i]]++;
//             }
//             int num = 3;
//             System.out.println(num + " occurs " + count[num] + " times");
//     }
// }

// ydi all number chahiye to
// public class numbercount {
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 3,5,5,1,3,2,1,1,1};
//             int n = arr.length;
//             int count[] = new int[100];
//             for(int i = 0; i < n; i++){
//                 count[arr[i]]++;
//             }
//             for(int i = 0; i < count.length; i++){
//                 if(count[i] > 0){
//                     System.out.println(i + " occurs " + count[i] + " times");
//                 }
//             }
//     }
// }


// ydi input string ho to
// 1. using brute force method to find the count of a character in O(n) time
// public class numbercount {
//     public static void main(String[] args) {
//         String str = "hello world";
//         char ch = 'o';
//         int count = 0;
//         for(int i = 0; i < str.length(); i++){
//             if(str.charAt(i) == ch){
//                 count++;
//             }
//         }
//         System.out.println(ch + " occurs " + count + " times");
//     } 
// }

// 2. using precomputed count array to find the count of a character in O(1) time
public class numbercount {
    public static void main(String[] args) {
        String str = "hello world";
        int count[] = new int[256];
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }
        char ch = 'o';
        System.out.println(ch + " occurs " + count[ch] + " times");
    }
}