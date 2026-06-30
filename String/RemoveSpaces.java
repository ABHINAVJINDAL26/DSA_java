package String;

public class RemoveSpaces {
    public static String removespaces(String s) {
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            if(ch != ' ') ans.append(ch);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "g eeks for ge eks";
        System.out.println("String after removing spaces: "+ removespaces(s));
    }
}
