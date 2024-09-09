package tradition150;

public class MinimumPathSum64 {

    private class TestCase {
        static int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(m * n) m = depth n = width
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        int length = grid.length;
        int width = grid[0].length;
        for(int row = 0; row < length; row++){
            for(int column = 0; column < width; column++) {
                if(column > 0 && row > 0) {
                    grid[row][column] = grid[row][column] + Math.min(grid[row - 1][column], grid[row][column - 1]);
                } else if(column != 0) {
                    grid[row][column] = grid[row][column - 1] + grid[row][column];
                } else if(row != 0) {
                    grid[row][column] = grid[row - 1][column] + grid[row][column];
                }
            }
        }
        return grid[length - 1][width - 1];
    }
}
