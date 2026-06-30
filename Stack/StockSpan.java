package Stack;

public class StockSpan {
    public  static int[] stockspan(int[]price) {
        int n = price.length;
        int span[] = new int[n];
     
        for(int i=0;i<n;i++) {
            int count=1;

            for(int j=i-1;j>=0;j--) {
                if(price[i] >=price[j]) count++;
                else break;
            }

            span[i] = count;
        }

        return span;
    }

    public static void main(String[] args) {
        int [] price = {100,80,90,120};
        int ans[] = stockspan(price);

        for(int x: ans) {
            System.out.print(x + " ");
        }
    }
}
