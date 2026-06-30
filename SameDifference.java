import java.util.Scanner;

public class SameDifference {

    static int differnces(int[]arr) {
        int count=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j] - arr[i] == j-i) count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of test cases: ");
        int t= sc.nextInt();

        while(t-->0) {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[]arr= new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(differnces(arr));
        }

        sc.close();
    }
}
