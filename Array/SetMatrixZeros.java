package Array;

import java.util.Arrays;

// public class SetMatrixZeros {
//     public static void setzeros(int[][]matrix) {
//         int n = matrix.length;
//         int m = matrix[0].length;

//         boolean[] row = new boolean[n];
//         boolean[] col = new boolean[m];

//         for(int i=0;i<n;i++) {
//             for(int j=0;j<m;j++) {
//                 if(matrix[i][j]==0) {
//                     row[i]=true;
//                     col[j]=true;
//                 }
//             }
//         }

//         for(int i=0;i<n;i++) {
//             for(int j=0;j<m;j++) {
//                 if(row[i] || col[j]) matrix[i][j] = 0;
//             }
//         }
//     }

//     public static void printMatrix(int[][] matrix) {
//         for(int[] row : matrix) {
//             System.out.println(Arrays.toString(row));
//         }
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 1, 1},
//             {1, 0, 1},
//             {1, 1, 1}
//         };

//         System.out.println("Original Matrix:");
//         printMatrix(matrix);

//         setzeros(matrix);

//         System.out.println("\nMatrix after setting zeroes:");
//         printMatrix(matrix);

            
//     }
// }

// Optimal approach

public class SetMatrixZeros {

    public static void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        // Step 1: check first row
        for(int j = 0; j < m; j++) {
            if(matrix[0][j] == 0) {
                firstRow = true;
                break;
            }
        }

        // Step 2: check first column
        for(int i = 0; i < n; i++) {
            if(matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }

        // Step 3: mark
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 4: fill
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 5: first row
        if(firstRow) {
            for(int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 6: first column
        if(firstCol) {
            for(int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    // separate method (outside)
    public static void printMatrix(int[][] matrix) {
        for(int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);  // correct name

        System.out.println("\nMatrix after setting zeroes:");
        printMatrix(matrix);
    }
}