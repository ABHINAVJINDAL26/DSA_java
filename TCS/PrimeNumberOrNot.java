package TCS;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<=1) {
            System.out.println("not a prime number");
            return;
        }

        boolean isprime = true;
        for(int i=2;i*i<=num;i++) {
            if(num%i==0) {
                isprime = false;
                break;
            }
        }

        if(isprime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
