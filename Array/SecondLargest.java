package Array;

class SecondLargest {

    public static void slargest(int arr[]) {
        int n = arr.length;
    
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
    
        for(int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }
    
        if(secondlargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest element is: " + secondlargest);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 8, 12, 3};
        slargest(arr);
    }
}
