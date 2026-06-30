package BasicMath;

import java.util.Arrays;
import java.util.Scanner;

public class SieveErothesnes {
    public static int[] sieve(int n) {
        boolean[]isprime = new boolean[n+1];
        Arrays.fill(isprime, true);

        isprime[0] = false;
        isprime[1] = false;

        for(int i=2;i*i<=n;i++) {
            if(isprime[i]) {
                for(int j = i*i;j<=n;j+=i) {
                    isprime[j] = false;
                }
            }
        }

        int[]res = new int[n];
        int index=0;
        for(int i=2;i<=n;i++) {
            if(isprime[i]) res[index++] = i;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
       int[]ans = sieve(n);

       for(int x : ans) {
           if(x != 0)
            System.out.print(x + " ");
        }
        sc.close();
    }
}





// int[] prime = new int[n+1];

//         for(int i=0;i<=n;i++) {
//             prime[i] = i;
//         }

//         for(int i=2;i*i<=n;i++) {
//             if(prime[i]==i) {

//                 for(int j=i*i;j<=n;j+=i) {
//                     if(prime[j]==j) {
//                         prime[j]=i;
//                     }
//                 }
//             }
//         }

//         return prime;



