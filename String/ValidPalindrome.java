package String;


// /brute force
// public class ValidPalindrome {
//     public static boolean isPalindrome(String s) {
//         StringBuilder cleaned = new StringBuilder();

//         for(int i=0;i<s.length();i++) {
//             char ch = s.charAt(i);

//             if(Character.isLetterOrDigit(ch)) {
//                 cleaned.append(Character.toLowerCase(ch));
//             }
//         }

//         String original = cleaned.toString();

//         String reversed = new StringBuilder(original).reverse().toString();
//         return original.equals(reversed);                                                    
//     }

//     public static void main(String[] args) {
//         String s = "race car";
//         System.out.println(isPalindrome(s));
//     }
// }


// optimal approach using two pointers

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        int left=0, right=n-1;
        
       while(left<right) {
        while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }

        while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }

        char ch1 = Character.toLowerCase(s.charAt(left));
        char ch2 = Character.toLowerCase(s.charAt(right));

        if(ch1 != ch2) return false;
        left++;
        right--;
       }
       
       return true;
    }

    public static void main(String[] args) {
        String s = "race car";
        System.out.println(isPalindrome(s));
    }
}