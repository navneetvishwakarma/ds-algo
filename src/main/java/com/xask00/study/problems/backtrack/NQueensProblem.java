package com.xask00.study.problems.backtrack;

public class NQueensProblem {

    public static void main(String[] args) {
        NQueensProblem nQueensProblem = new NQueensProblem();
        nQueensProblem.solveNQueen(5);
    }

    public void solveNQueen(int size) {
        int[][] board = new int[size][size];
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                board[row][col] = 0;
            }
        }
        if (solveNQueen(board, size, 0)) {
            // printSolution(board, size);
        } else {
            // System.out.println("Solution does not exist!");
        }

    }

    /**
     * Check only the left side of the grid as the queens are being placed from the left side
     * @param board
     * @param row
     * @param col
     * @return
     */
    private boolean isSafe(int[][] board, int size, int row, int col) {
        // Check the same row
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) return false;
        }
        // Check diagonally up, left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }
        // Check diagonally down, left side
        for (int i = row, j = col; i < size && j >= 0; i++, j--) {
            if (board[i][j] == 1) return false;
        }
        return true;
    }

    /**
     * Solve Queen placement by placing in each column and then backtracking
     * @param board
     * @param size
     * @param col
     * @return
     */
    private boolean solveNQueen(int[][] board, int size, int col) {
        // If all queens are placed
        if (col >= size) {
            printSolution(board, size);

        }

        // Try placing queen in each row
        for (int i = 0; i < size; i++) {
            // If placement is safe, place the queen
            if (isSafe(board, size, i, col)) {
                board[i][col] = 1;
                // Recur further to place remaining queens
                if (solveNQueen(board, size, col+1)) {
                    return true;
                }
                // If the recursion doesn't lead to a solution, backtrack
                board[i][col] = 0;
            }
        }
        // If the queen cannot be placed in any row in the given column, return false;
        return false;
    }

    public void printSolution(int[][] board, int size) {
        for(int row = 0; row < size; row++) {
            System.out.print("[ ");
            for(int col = 0; col < size; col++) {
                char c = board[row][col] == 0 ? '-' : 'Q';
                System.out.print(c + " ");
            }
            System.out.println("]");
        }
        System.out.println("");
    }

}
