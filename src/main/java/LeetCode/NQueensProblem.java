package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueensProblem {
    public static void main(String[] args) {
        solveNQueens(4);
    }

    private static List<List<String>> solveNQueens(int n) {
        List<List<String>> output = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solveNQueens(n, output, board, 0);
        return output;
    }

    private static boolean isSafe(int n, char[][] board, int row, int col) {
        // for column
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') return false;
        }
        // upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        // upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }

    private static void solveNQueens(int n, List<List<String>> list, char[][] nQueens, int row) {
        if (row == n) {
            List<String> sol = new ArrayList<>();
            for (char[] nQueen : nQueens) {
                sol.add(new String(nQueen));
            }
            list.add(sol);
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(n, nQueens, row, col)) {
                nQueens[row][col] = 'Q';
                solveNQueens(n, list, nQueens, row + 1);
                nQueens[row][col] = '.';
            }
        }
    }
}
