package String;

public class FrequencyCount {
    public static void main(String[] args) {
        String s = "aabccaa";

        int [] freq = new int[256];

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            freq[ch]++;
        }

        // print freq

        for(int i=0;i<256;i++) {
            if(freq[i]>0) {
                System.out.println((char)i + "-> " + freq[i]);
            }
        }
    }
}
