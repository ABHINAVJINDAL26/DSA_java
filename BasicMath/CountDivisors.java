package BasicMath;


// Calaculate the number of divisors of a given number n
// public class CountDivisors {
//     public static void main(String[] args) {
//         int n = 12;
//         List<Integer> divisors  = new ArrayList<>();  
        
//         for(int i=1;i*i<=n;i++) {
//             if((n%i)==0) {
//                 divisors.add(i);
//                 if(i != n/i) {
//                     divisors.add(n/i);
//                 }   
//             }
//         }
//         Collections.sort(divisors);
//         System.out.println("Divisors of " + n + ": " + divisors);
//     }
// }


// Count number of divisors of a given number n
public class CountDivisors {
    public static void main(String[] args) {
        int n = 17; 
        int count = 0;

        for(int i=1;i*i<=n;i++) {
            if((n%i)==0) {
                count++;
                if(i != n/i) {
                    count++;
                }   
            }
        }
        System.out.println("Number of divisors of " + n + ": " + count);
    }
}