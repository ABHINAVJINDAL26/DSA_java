package String;

// Brute force
// public class CheckAnagram {
//     public static boolean anagram(String s1, String s2) {
        
//         if(s1.length() != s2.length()) return false;
//         int count1=0, count2=0;

//         for(int i=0;i<s1.length();i++) {
//             char ch = s1.charAt(i);

//             for(int j=0;j<s1.length();j++) {
//                 if(s1.charAt(j) == ch) count1++;
//             }

//             for(int j=0;j<s2.length();j++) {
//                 if(s2.charAt(j) == ch) count2++;
//             }

//             if(count1 != count2) return false;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         String s1 = "listen";
//         String s2 = "silent";

//         System.out.println(anagram(s1, s2));
//     }
// }

// Optimal

public class CheckAnagram {
    public static boolean anagram(String s1, String s2) {
        
        if(s1.length() != s2.length()) return false;
        int[] freq = new int[256];

        for(int i=0;i<s1.length();i++) {
            char ch = s1.charAt(i);
            freq[ch]++;
        }

        for(int i=0;i<s2.length();i++) {
            char ch = s2.charAt(i);
            freq[ch]--;
        }

        for(int i=0;i<s1.length();i++) {
            if(freq[i] !=  0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(anagram(s1, s2));
    }
}