package Hashing;

public class numbercount {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3,5,5,1,3,2,1,1,1};
            int n = arr.length;
            int count[] = new int[100];
            for(int i = 0; i < n; i++){
                count[arr[i]]++;
            }
            for(int i = 0; i < count.length; i++){
                if(count[i] > 0){
                    System.out.println(i + " occurs " + count[i] + " times");
                }
            }
    }
}
