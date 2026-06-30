package String;

import java.util.*;

public class FindAllAnagram {

    // Check anagram
    public static boolean isAnagram(
        String s1,
        String s2) {

        int freq[] = new int[256];

        for (int i = 0; i < s1.length(); i++) {

            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {

            if (freq[i] != 0) {

                return false;
            }
        }

        return true;
    }

    public static List<Integer> findAnagrams(
        String s,
        String p) {

        List<Integer> ans =
            new ArrayList<>();

        int k = p.length();

        // Generate substrings
        for (int i = 0;
             i <= s.length() - k;
             i++) {

            String sub =
                s.substring(i, i + k);

            // Check anagram
            if (isAnagram(sub, p)) {

                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(
            findAnagrams(s, p)
        );
    }
}
