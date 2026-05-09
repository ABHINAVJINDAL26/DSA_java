package Array;

import java.util.ArrayList;

public class TransposeMatrix {
    public static ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0;i<m;i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for(int j=0;j<n;j++) {
                row.add(mat[j][i]);
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        ArrayList<ArrayList<Integer>> transposed = transpose(mat);

        for (ArrayList<Integer> row : transposed) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
