package BasicMath;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 634;
        int originalNum = num;
        int sum =0;

        while(num>0) {
            int ld = num % 10;
            sum = sum + (ld*ld*ld*ld);
            num = num/10;
        }

        if(sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
