package String;


// Brute force
// public class ValidPalindrome2 {
//     public static boolean isPalindrome(String s) {
//         int n = s.length();

//         int left=0, right=n-1;
//         while(left<right) {
//             if(s.charAt(left) != s.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }

//         return true;
//     }

//     public static boolean Validpalindrome(String s) {
//         int n = s.length();
//        for(int i=0;i<n;i++) {
//         String temp = s.substring(0,i) + s.substring(i+1);

//         if(isPalindrome(temp)) return true;
//        }

//        return isPalindrome(s);
//     }
    
//     public static void main(String[] args) {
//         String s = "abad";
//         System.out.println(Validpalindrome(s));
//     }
// }


public class ValidPalindrome2 {
    public static boolean isPalindrome(String s, int left, int right) {

        while(left<right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static boolean Validpalindrome(String s) {
        int n = s.length();
        int left=0, right=n-1;
        while(left<right) {

            if(s.charAt(left) != s.charAt(right)) {

                return isPalindrome(s,left+1, right) || isPalindrome(s, left, right-1);
            }
            left++;
            right--;
        }

        return true;

    }
    
    public static void main(String[] args) {
        String s = "abacd";
        System.out.println(Validpalindrome(s));
    }
}
