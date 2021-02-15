package com.xask00.study.problems.backtrack;

public class Sudoku {

    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        int N = 9;
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (!sudoku.solve(board, N)) {
            System.out.println("No solution!");
        };
    }

    public boolean solve(int[][] board, int N) {
        int row = -1;
        int col = -1;

        boolean isBoardFull = true;
        // Find the next empty cell to be filled with new number
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isBoardFull = false;
                    break;
                }
            }
            if (!isBoardFull) {
                break;
            }
        }
        // If no empty cell left, return true
        if (isBoardFull) {
            print(board, N);
            return true;
        }

        for (int num = 1; num <= N; num++) {
            if (isSafe(board, N, row, col, num)) {
                board[row][col] = num;
                if (solve(board, N)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private boolean isSafe(int[][] board, int N, int row, int col, int num) {
        // Check if the number is unique in the same row
        for(int i = 0; i < N; i++) {
            if (board[row][i] == num) return false;
        }
        // Check if the number is unique in the sam column
        for (int i = 0; i < N; i++) {
            if (board[i][col] == num) return false;
        }
        // Check the uniqueness in the box
        int boxSize = (int) Math.sqrt(N);
        int rowStart = row - (row%boxSize);
        int colStart = col - (col%boxSize);

        for (int i = rowStart; i < rowStart+boxSize; i++) {
            for (int j = colStart; j < colStart+boxSize; j++) {
                if (board[i][j] == num) return false;
            }
        }
        // its safe placement
        return true;
    }

    private void print(int[][] board, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        boolean[][] grid = new boolean[N][N];
        System.out.println(grid[3][4]);
    }
}
