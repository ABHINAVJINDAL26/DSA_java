package TCS;

public class CountDigits {
    public static void main(String[] args) {
        int n = 147852963;
        int count=0;
        while(n>0) {
            // int ld = n%10;
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
