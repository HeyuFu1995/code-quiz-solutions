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
     * Solution
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
}
