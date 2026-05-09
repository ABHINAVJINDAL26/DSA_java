package Array;


// Merge 2 Sorted arrays without using extra space
import java.util.Arrays;

// public class Merge2SortedArrays {
//     public static void mergetwosortedarrays(int []a, int []b) {
//         int n = a.length;
//         int m = b.length;
        
//         int[] temp = new int[n+m];
        
//         int i=0,j=0,k=0;
//         while(i<n && j<m) {
//             if(a[i] <= b[j]) temp[k++] = a[i++];
//             else temp[k++] = b[j++];
//         }
        
//         while(i<n) temp[k++] = a[i++];
//         while(j<m) temp[k++] = b[j++];
        
//         for(i=0;i<n;i++) {
//             a[i] = temp[i];
//         }
        
//         for(j=0;j<m;j++) {
//             b[j] = temp[n+j];
//         }
//     }

//     public static void main(String[] args) {
//         int a[] = {1,3,5,7};
//         int b[] = {0,2,6,8,9};

//         System.out.println("Sorted Arrays without using extra space");

//         mergetwosortedarrays(a, b);

//         System.out.println(Arrays.toString(a));
//         System.out.println(Arrays.toString(b));
//     }
// }


// Optimal approach

public class Merge2SortedArrays {
    public static void mergetwosortedarrays(int []a, int []b) {
        // int n = a.length;
        int m = b.length;
        
        int left = a.length-1;
        int right = 0;

        while(left>=0 && right<m) {
            if(a[left] > b[right]) {
                int temp = a[left];
                a[left] = b[right];
                b[right] = temp;

                left--;
                right++;
            } else{ 
                break;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);
    }

    public static void main(String[] args) {
        int a[] = {1,3,5,7};
        int b[] = {0,2,6,8,9};

        System.out.println("Sorted Arrays without using extra space");

        mergetwosortedarrays(a, b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}