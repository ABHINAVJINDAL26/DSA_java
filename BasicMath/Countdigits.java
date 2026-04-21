package BasicMath;

public class Countdigits {
    public static void main(String[] args) {
        // int num = 12345;
        // int count = 0;

        // while(num>0) {
        //     num = num/10;
        //     count++;
        // }


        // method 2 (using logarithm)
        int num = 12345;
        int count = (int)(Math.log10(num) + 1); 

        System.out.println("Number of digits: " + count);  
    }
}
