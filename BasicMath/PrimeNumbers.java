package BasicMath;

// public class PrimeNumbers {
//     public static void main(String[] args) {
//         int num = 24;
//         if(num<=1) {
//             System.out.println(num + " is not a prime number.");
//             return;
//         }

//         boolean isPrime = true;
//         for(int i=2; i<=Math.sqrt(num); i++) {
//             if(num % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }  

//         if(isPrime) {
//             System.out.println(num + " is a prime number.");
//         } else {
//             System.out.println(num + " is not a prime number.");
//         }
//     }
// }

// optimized version using method

public class PrimeNumbers {
    boolean isprime(int num) {
        if(num<=1) return false;

        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        PrimeNumbers pn = new PrimeNumbers();
        System.out.println(pn.isprime(17)); // true
        System.out.println(pn.isprime(24)); // false
    }
}

// more optimized: remove even numbers greater than 2

// boolean isprime(int num) {
//     if(num<=1) return false;
//     if(num == 2) return true;
//     if(num % 2 == 0) return false;

//     for(int i=3; i<=Math.sqrt(num); i+=2) {
//         if(num % i == 0) {
//             return false;
//         }
//     }
//     return true;
// }