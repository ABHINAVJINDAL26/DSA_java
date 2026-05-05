package Array;


// Brute force
// public class MajorityElement {
//     public static int majority(int []arr) {
//         int n = arr.length;

//         for(int i=0;i<n;i++) {
//             int count=0;
//             for(int j=0;j<n;j++) {
//                 if(arr[j] == arr[i]) count++;
//             }

//             if(count > n/2) {
//                 return arr[i];
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,1,1,1,3};
//         System.out.println("Majority element is: "+ majority(arr));
//     }
// }

// Optimal approach -> Boyer-Moore Voting Algorithm
public class MajorityElement {
    public static int majority(int []arr) {
        int candidate=0, count=0;

        for(int num: arr) {
            if(count==0) {
                candidate = num;
            }

            if(num==candidate) count++;
            else count--;
        }
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        }

		return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,1,1,3};
        System.out.println("Majority element is: "+ majority(arr));
    }
}
