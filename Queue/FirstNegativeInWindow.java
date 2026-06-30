package Queue;

public class FirstNegativeInWindow {
    public static void firstnegative(int[]arr, int k) {
        int n = arr.length;

        for(int i=0;i<=n-k;i++) {
            boolean found = false;

            for(int j=i;j<i+k;j++) {
                if(arr[j] < 0) {
                    System.out.print(arr[j] + " ");
                    found = true;
                    break;
                }
            }

            if(!found) System.out.print(0 +" ");
        }
    }

    public static void main(String[] args) {
        int[]arr = {-8, 2,3,-6,10};
        int k=2;

        firstnegative(arr, k);
    }
}
