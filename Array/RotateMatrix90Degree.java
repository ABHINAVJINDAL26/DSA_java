package Array;

// public class RotateMatrixBy90Degree {

//     public static int[][] rotate(int[][] matrix) {
//         int n = matrix.length;
//         int[][] result = new int[n][n];

//         // Correct brute force
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 result[j][n - 1 - i] = matrix[i][j];
//             }
//         }

//         return result;
//     }

//     // Helper function to print matrix
//     public static void printMatrix(int[][] matrix) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {

//         int[][] matrix = {
//                 {1, 2, 3},
//                 {4, 5, 6},
//                 {7, 8, 9}
//         };

//         System.out.println("Original Matrix:");
//         printMatrix(matrix);

//         int[][] rotated = rotate(matrix);

//         System.out.println("\nRotated Matrix (90° Clockwise):");
//         printMatrix(rotated);
//     }
// }


// Optimal approach

public class RotateMatrix90Degree {
    public static void rotate(int [][] matrix) {
        int n = matrix.length;


        // Transpose of a matrix
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                int temp = matrix[i][j];
                matrix[i][j]  = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }

        // Reverse of a matrix
        for(int i=0;i<n;i++) {
            int left=0, right=n-1;

            while (left<right) {
                int  temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;                
            }
        }
    }

    public static void printmatrix(int[][] matrix) {
            for(int i=0;i<matrix.length;i++) {
                for(int j=0;j<matrix[0].length;j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printmatrix(matrix);
        
        rotate(matrix);

        System.out.println("\nRotated Matrix (90° Clockwise):");
        printmatrix(matrix);
    }
}