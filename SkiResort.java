public class SkiResort {
    public static int countvacation(int[]num, int k, int q) {
        int n = num.length;

        int count=0;

        for(int start=0;start<n;start++) {
            for(int end=start;end<n;end++) {
                int length = end-start+1;

                if(length>=k) {
                    boolean valid = true;

                    for(int i=start;i<=end;i++) {
                        if(num[i]>q) {
                            valid = false;
                            break;
                        }
                    }

                    if(valid) {
                        count++;
                    }
                }
            }
        }

        return count;
    }


}
