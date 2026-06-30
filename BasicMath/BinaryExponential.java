package BasicMath;

public class BinaryExponential {
    public static int power(int a, int b) {
        int ans=1;
        
        while (b>0) {

            if((b&1)==1) ans *= a;
            a = a*a;
            b /= 2;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int a= 2, b=8;
        System.out.println(power(a, b));
    }
}
