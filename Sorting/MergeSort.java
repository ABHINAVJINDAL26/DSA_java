package Sorting;

public class MergeSort {

    public static void mergesort(int arr[], int left, int right) {
        if(left>= right) return;

        int mid = left + (right - left) / 2;

        mergesort(arr, left, mid);
        mergesort(arr, mid+1, right);

        merge(arr, left, mid, right);

    }

    public static void merge(int arr[], int left, int mid, int right) {
        int temp[] = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= right) {
            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= right) {
            temp[k++] = arr[j++];
        }

        for(int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 6, 3, 2};
        mergesort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
