package com.xask00.study.problems.queue;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    private class Cell {
        int x;
        int y;

        Cell (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int timeToRot(int[][] grid) {
        int rows = grid.length;
        if (rows == 0) return 0;
        int cols = grid[0].length;
        int timeToRot = 0;

        Queue<Cell> queue = new LinkedList<>();

        // Add all the rotten oranges in the queue
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new Cell(i, j));
                }
            }
        }
        // Add a delimiter cell
        queue.add(new Cell(-1, -1));

        while(!queue.isEmpty()) {
            boolean flag = false;
            while(queue.peek().x != -1 && queue.peek().y != -1) {
                Cell currCell = queue.peek();
                // Check for left cell
                if (isValidCell(grid, currCell.x, currCell.y-1) && grid[currCell.x][currCell.y-1]==1) {
                    if (!flag) {
                        flag = true;
                        timeToRot++;
                    }
                    grid[currCell.x][currCell.y-1] = 2;
                    queue.add(new Cell(currCell.x, currCell.y-1));
                }
                // Check for right cell
                if (isValidCell(grid, currCell.x, currCell.y+1) && grid[currCell.x][currCell.y+1]==1) {
                    if (!flag) {
                        flag = true;
                        timeToRot++;
                    }
                    grid[currCell.x][currCell.y+1] = 2;
                    queue.add(new Cell(currCell.x, currCell.y+1));
                }
                // Check for top cell
                if (isValidCell(grid, currCell.x-1, currCell.y) && grid[currCell.x-1][currCell.y]==1) {
                    if (!flag) {
                        flag = true;
                        timeToRot++;
                    }
                    grid[currCell.x-1][currCell.y] = 2;
                    queue.add(new Cell(currCell.x-1, currCell.y));
                }
                // Check for bottom cell
                if (isValidCell(grid, currCell.x+1, currCell.y) && grid[currCell.x+1][currCell.y]==1) {
                    if (!flag) {
                        flag = true;
                        timeToRot++;
                    }
                    grid[currCell.x+1][currCell.y] = 2;
                    queue.add(new Cell(currCell.x+1, currCell.y));
                }
                queue.remove();
            }
            // Remove the delimiter
            queue.remove();

            // Add delimiter before another frame
            if (!queue.isEmpty()) {
                queue.add(new Cell(-1, -1));
            }
        }

        return areAllRotten(grid) ? timeToRot : -1;
    }

    private boolean areAllRotten(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidCell(int[][] grid, int x, int y) {
        return (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length);
    }
}
