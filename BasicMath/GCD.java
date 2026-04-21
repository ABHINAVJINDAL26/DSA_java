package BasicMath;
// optimized version of to find gcd/hcf using Euclidean algorithm
public class GCD {
    public static int gcd(int a, int b) {
        if(b==0) return a;

        while(a>0 && b>0) {
            if(a>b) {
                a = a%b;
            } else {
                b = b%a;    
            }
        }

        if(a==0) return b;
        return a;
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        System.out.println("gcd of " + a + " and " + b + " is: " + gcd(a, b));
    }       
}


// brute force method to find gcd/hcf

// int gcd(int a, int b){
//     int ans = 1;
//     for(int i = 1; i <= Math.min(a,b); i++){
//         if(a % i == 0 && b % i == 0){
//             ans = i;
//         }
//     }
//     return ans;
// }