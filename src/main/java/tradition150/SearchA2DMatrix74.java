package tradition150;

public class SearchA2DMatrix74 {

    private class TestCase {

        static int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        static int target = 3;
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(m + n)
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int length = matrix.length;
        if(length == 0) {
            return false;
        }
        int width = matrix[0].length;
        if(width == 0) {
            return false;
        }

        int row = length - 1;
        int column = 0;

        while(matrix[row][column] > target && row >= 1) {
            row--;
        }
        while(matrix[row][column] < target && column < width - 1) {
            column++;
        }
        return target == matrix[row][column];
    }
}
