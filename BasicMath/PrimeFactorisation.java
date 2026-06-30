package BasicMath;

public class PrimeFactorisation {

    static int[] spf;

    public static void sieve(int n) {
        spf = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {

            if (spf[i] == i) {

                for (int j = i * i; j <= n; j += i) {

                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
    }

    public static void primeFactorisation(int n) {

        while (n > 1) {
            System.out.print(spf[n] + " ");
            n /= spf[n];
        }

        System.out.println();
    }

    public static void main(String[] args) {

        sieve(100); 

        primeFactorisation(84);
    }
}