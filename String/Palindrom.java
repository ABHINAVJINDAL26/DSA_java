package String;


// Brute force
// public class Palindrom {
//     public static boolean palindrom(String s) {
//         // reverse string
//         StringBuilder ans = new StringBuilder();
//         for(int i=s.length()-1;i>=0;i--) {

//             ans.append(s.charAt(i));
//         }

//         return s.equals(ans.toString());
//     }

//     public static void main(String[] args) {
//         // String s = "madam"; // true
//         String s1 = "ABCD";   // false

//         System.out.println(palindrom(s1));
//     }
// }


// Optimal approach

public class Palindrom {
    public static boolean palindrom(String s) {
        

        int left = 0, right = s.length()-1;

        while(left<right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "madam"; // true
        // String s1 = "ABCD";   // false

        System.out.println(palindrom(s));
    }
}