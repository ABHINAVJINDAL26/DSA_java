package Array;

import java.util.ArrayList;
import java.util.List;

// Type1: Given row number and print elements of that row
// public class PascalTriangle {
//     public static List<List<Integer>> pascal(int n) {
//         List<List<Integer>> triangle = new ArrayList<>();

//         for(int i=0;i<=n;i++) {
//             List<Integer> row = new ArrayList<>();
//             for(int j=0;j<=i;j++) {
//                 if(j==0 || j==i) row.add(1);
//                 else {
//                     int val = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
//                     row.add(val);
//                 }
//             }
//             triangle.add(row);
//         }

//         return triangle;
//     }

//     public static void main(String[] args) {
//         int rownumber = 4;

//         List<List<Integer>> triangle = pascal(rownumber);

//         System.out.println(triangle.get(rownumber));

//     }
// }


// Complete pascal triangle

public class PascalTriangle {
    public static List<List<Integer>> pascal(int n) {
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i=0;i<=n;i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i) row.add(1);
                else {
                    int val = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                    row.add(val);
                }
            }
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int rownumber = 4;

        List<List<Integer>> result = pascal(rownumber);

        for (List<Integer> row : result) {

            System.out.println(row);
        }

    }
}