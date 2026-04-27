package Array;

public class SecondSmallest {
    public static void ssmallest(int arr[]) {
        int n = arr.length;

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i] < secondsmallest) {
                secondsmallest = arr[i];
            }
        }

        if(secondsmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element");
        } else {
            System.out.println("Second smallest element is: " + secondsmallest);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 8, 12, 3};
        ssmallest(arr);
    }
}
