package TCS;

import java.util.Scanner;

public class CheckEvenOrOdd {

    public static void fib(int n) {
        int [] arr = new int[n];
        arr[0]=5;
        arr[1]=6;

        for(int i=2;i<=n-1;i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        fib(n);
        sc.close();
    }
}
