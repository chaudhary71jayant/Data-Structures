
//The legendary NQueens Backtracking problem.
import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;

        List<List<String>> ans = SolveNQueens(n);

        System.out.println(ans);
    }

    static List<List<String>> SolveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        nQueens(n, board, ans, 0);
        return ans;

    }

    static void nQueens(int n, char[][] board, List<List<String>> ans, int row) {
        if (row == n) {
            List<String> sol = new ArrayList<>();
            for (char[] r : board) {
                sol.add(new String(r));
            }
            ans.add(sol);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(board, row, i, n)) {
                board[row][i] = 'Q';
                nQueens(n, board, ans, row + 1);
                board[row][i] = '.';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

}
