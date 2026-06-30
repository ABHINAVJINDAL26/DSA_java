package BasicMath;


import java.util.*;

public class SegmentedSieve {

    static ArrayList<Integer> simpleSieve(int limit) {

        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i * i <= limit; i++) {

            if(isPrime[i]) {

                for(int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();

        for(int i = 2; i <= limit; i++) {
            if(isPrime[i])
                primes.add(i);
        }

        return primes;
    }

    static void segmentedSieve(long L,long R){

        int limit = (int)Math.sqrt(R);

        ArrayList<Integer> primes = simpleSieve(limit);

        boolean[] isPrime = new boolean[(int)(R-L+1)];

        Arrays.fill(isPrime,true);

        for(int p:primes){

            long start = Math.max((long)p*p,
                    ((L+p-1)/p)*p);

            for(long j=start;j<=R;j+=p){

                isPrime[(int)(j-L)] = false;
            }
        }

        if(L==1)
            isPrime[0]=false;

        for(long i=L;i<=R;i++){

            if(isPrime[(int)(i-L)])
                System.out.print(i+" ");
        }

        System.out.println();
    }

    public static void main(String[] args){

        segmentedSieve(10,20);

    }
}