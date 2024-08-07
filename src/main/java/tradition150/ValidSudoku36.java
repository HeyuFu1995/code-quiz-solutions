package tradition150;

public class ValidSudoku36 {

    private class TestCase {
        static char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
    }

    public static void solution() {
    }

    /**
     * Solution
     * Time complexity: O(1) because sudoku board is stable
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][][] subBoxes = new boolean[3][3][9];

        for(int col = 0; col < 9; col++) {
            for(int row = 0; row < 9; row++) {
                char current = board[col][row];
                if(current != '.') {
                    int currentIndex = current - '0' - 1;
                    if(rows[row][currentIndex] || columns[col][currentIndex] || subBoxes[col/3][row/3][currentIndex]) {
                        return false;
                    }
                    rows[row][currentIndex] = true;
                    columns[col][currentIndex] = true;
                    subBoxes[col/3][row/3][currentIndex] = true;
                }
            }
        }
        return true;
    }
}
