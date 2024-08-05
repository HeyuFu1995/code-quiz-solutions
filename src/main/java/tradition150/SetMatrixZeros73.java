package tradition150;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros73 {
    private class TestCase {
        static int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
    }

    public static void solution() {
    }

    /**
     * Solution 1
     * Time Complexity: O(mn)
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        int colLength = matrix.length;
        int rowLength = matrix[0].length;
        Set<Integer> colSet = new HashSet<>();
        Set<Integer> rowSet = new HashSet<>();

        for(int colNum = 0; colNum < colLength; colNum++) {
            for(int rowNum = 0; rowNum < rowLength; rowNum++) {
                if (matrix[colNum][rowNum] == 0) {
                    colSet.add(colNum);
                    rowSet.add(rowNum);
                }
            }
        }

        for(int colNum = 0; colNum < colLength; colNum++) {
            for(int rowNum = 0; rowNum < rowLength; rowNum++) {
                if (colSet.contains(colNum) || rowSet.contains(rowNum)) {
                    matrix[colNum][rowNum] = 0;
                }
            }
        }
    }

    /**
     * Solution 2
     * Time Complexity: O(mn)
     * Reduce the Space Complexity to O(1)
     * @param matrix
     */
    public void setZeroes2(int[][] matrix) {
        int colLength = matrix.length;
        int rowLength = matrix[0].length;
        boolean flagCol0 = false;

        for(int col = 0; col < colLength; col++) {
            if(matrix[col][0] == 0) {
                flagCol0 = true;
            }
            for(int row = 1; row < rowLength; row++) {
                if(matrix[col][row] == 0) {
                    matrix[col][0] = 0;
                    matrix[0][row] = 0;
                }
            }
        }

        for(int col = colLength - 1; col >= 0; col--) {
            for(int row = 1; row < rowLength; row++) {
                if(matrix[col][0] == 0 || matrix[0][row] == 0) {
                    matrix[col][row] = 0;
                }
                if(flagCol0) {
                    matrix[col][0] = 0;
                }
            }
        }
    }
}
