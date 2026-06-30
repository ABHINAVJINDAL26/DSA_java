package String;

public class RemoveDuplicateChar {
    public static String removedup(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) ans.append(ch);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "programming";
        System.out.println("After removing duplicates: " + removedup(s));
    }
}
