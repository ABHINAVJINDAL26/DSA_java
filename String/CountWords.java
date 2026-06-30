package String;

public class CountWords {
    public static int count(String s) {
        int count=0;

        for (int i = 0; i < s.length(); i++) {

            if (!Character.isWhitespace(s.charAt(i))
                &&
               (i == 0 ||
                Character.isWhitespace(
                    s.charAt(i - 1)))) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "I Love Java";
        System.out.println("Total Words in String are: "+ count(s));
    }
}
