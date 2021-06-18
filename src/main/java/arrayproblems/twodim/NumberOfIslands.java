package arrayproblems.twodim;

import java.util.Deque;
import java.util.LinkedList;

/*
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.
*/

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '1'},
                {'0', '0', '0', '1', '1'}
        };
        int islands = numIslands(grid);
        System.out.println(islands);        // For above grid, answer will be 2
    }

    public static int numIslands(char[][] grid) {
        int count = 0;
        int[][] steps = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
//                    bfs(grid, i, j);
                    dfs(grid, steps, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void bfs(char[][] grid, int i, int j) {
        int[][] steps = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        Deque<Integer[]> queue = new LinkedList<>();
        queue.offerLast(new Integer[]{i, j});

        while (!queue.isEmpty()) {
            Integer[] curr = queue.pollFirst();
            int row = curr[0];
            int col = curr[1];
            if (check(grid, row, col)) {
                grid[row][col] = '0';
                for (int[] step : steps) {
                    queue.offerLast(new Integer[]{row + step[0], col + step[1]});
                }
            }
        }
    }

    private static void dfs(char[][] grid, int[][] steps, int i, int j) {
        if (check(grid, i, j)) {
            grid[i][j] = '0';
            for (int[] step : steps) {
                dfs(grid, steps, i + step[0], j + step[1]);
            }
        }
    }

    private static boolean check(char[][] grid, int row, int col) {
        return 0 <= row && row < grid.length && 0 <= col && col < grid[0].length && grid[row][col] == '1';
    }
}
