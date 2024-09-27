package tradition150;

public class NumberOfIslands200 {
    private class TestCase {

    }

    public static void solution() {

    }

    /**
     * Solution
     * Time Complexity: O(n)
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {
        int length = grid.length;
        int width = grid[0].length;
        boolean[][] visited = new boolean[length][width];

        int ans = 0;
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < width; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    ans++;
                    dfs(i, j, length, width, grid, visited);
                }
            }
        }
        return ans;
    }

    private void dfs(int yPos, int xPos, int length, int width, char[][] grid, boolean[][] visited) {
        if(yPos < 0 || xPos < 0 || yPos >= length || xPos >= width || grid[yPos][xPos] == '0' || visited[yPos][xPos]) {
            return;
        }
        visited[yPos][xPos] = true;
        dfs(yPos - 1, xPos, length, width, grid, visited);
        dfs(yPos + 1, xPos, length, width, grid, visited);
        dfs(yPos, xPos - 1, length, width, grid, visited);
        dfs(yPos, xPos + 1, length, width, grid, visited);
    }
}
