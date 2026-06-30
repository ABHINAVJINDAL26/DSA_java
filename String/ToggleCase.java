package String;

public class ToggleCase {
    public static String toggle(String s) {
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            if(ch>='A' && ch<='Z') {
                ch = (char)(ch+32);
            } 
            else if(ch>='a' && ch<='z') {
                ch = (char)(ch-32);
            }

            ans.append(ch);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "AbHi";
        System.out.println(toggle(s));
    }
}
