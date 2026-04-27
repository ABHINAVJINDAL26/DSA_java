package Array;

public class RemoveDuplicates {
    public static void removeduplicates(int arr[]) {
        int n = arr.length;
        int j = 0;

        for(int i = 0; i < n-1; i++) {
            if(arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];

        for(int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5};
        removeduplicates(arr);
    }
}