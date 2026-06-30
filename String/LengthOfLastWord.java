package String;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String word = "Hello world";

        String[] arr =  word.trim().split(" ");

        String lw = arr[arr.length-1];

        int ans = lw.length();

        System.out.println("length of last word is: "+ ans);
    }
}
