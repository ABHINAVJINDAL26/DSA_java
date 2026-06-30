package String;

public class LongestPalindrome {
    public static int longestpalindromelength(String s) {

        int freq [] = new int[256];

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }


        int length=0;
        boolean oddfound = false;

        for(int i=0;i<256;i++) {
            if(freq[i] % 2==0) {
                length += freq[i];
            }

            else {
                length += freq[i]-1;
                oddfound =true;
            }
        }

        if(oddfound) length++;
        return length;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestpalindromelength(s));
    }
}
