package com.xask00.study.problems.dp;

/**
 * Time Complexity (Normal Recursion)   : O(2^(M*N))
 * Time Complexity (DP):                : O(M*N)
 * Space Complexity                     : O(M*N)
 */
public class GridTraveler {
    public long countAllPath(int rows, int cols) {
        if (rows == 0 || cols == 0) return 0;
        long[][] pathMemo = new long[rows][cols];
        for (int i = 0; i < rows; i++) {
            pathMemo[i][0] = 1;
        }
        for (int i = 0; i < cols; i++) {
            pathMemo[0][i] = 1;
        }
        return countAllPath(rows, cols, pathMemo);
    }

    private long countAllPath(int rows, int cols, long[][] pathMemo) {
        if (pathMemo[rows-1][cols-1] == 0) {
            long count = countAllPath(rows - 1, cols, pathMemo) + countAllPath(rows, cols - 1, pathMemo);
            pathMemo[rows-1][cols-1] = count;
        }
        return pathMemo[rows-1][cols-1];
    }
}
