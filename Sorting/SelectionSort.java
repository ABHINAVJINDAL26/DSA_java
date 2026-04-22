package Sorting;

public class SelectionSort {
    public static void selectionsort(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minindex = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        selectionsort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
