package String;

public class FirstNonRepeating {

    public static char firstNonRepeat(String s) {

        int freq[] = new int[256];

        // Count frequencies
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            freq[ch]++;
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (freq[ch] == 1) {

                return ch;
            }
        }

        return '#';
    }

    public static void main(String[] args) {

        String s = "aabccdeff";

        System.out.println("First Non repeating char is: "+ firstNonRepeat(s));
    }
}