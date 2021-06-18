package arrayproblems.twodim;

import java.util.ArrayDeque;
import java.util.Deque;

public class BFS {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};

        bfs(mat);
        System.out.println();
        bfs1(mat);
    }

    private static void bfs(int[][] mat) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        int[][] steps = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        Deque<Integer[]> queue = new ArrayDeque<>();
        queue.offerLast(new Integer[]{0, 0});
        visited[0][0] = true;
        System.out.print(mat[0][0] + ", ");

        while (!queue.isEmpty()) {
            Integer[] curr = queue.poll();
            for (int[] step : steps) {
                int i = curr[0] + step[0];
                int j = curr[1] + step[1];
                if (check(mat, visited, i, j)) {
                    System.out.print(mat[i][j] + ", ");
                    visited[i][j] = true;
                    queue.offerLast(new Integer[]{i, j});
                }
            }
        }
    }

    private static void bfs1(int[][] mat) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        int[][] steps = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        Deque<Integer[]> queue = new ArrayDeque<>();
        queue.offerLast(new Integer[]{0, 0});

        while (!queue.isEmpty()) {
            Integer[] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];

            if (check(mat, visited, i, j)) {
                visited[i][j] = true;
                System.out.print(mat[i][j] + ", ");

                for (int[] step : steps) {
                    queue.offerLast(new Integer[]{i + step[0], j + step[1]});
                }
            }
        }
    }

    private static boolean check(int[][] arr, boolean[][] visited, int i, int j) {
        return 0 <= i && i < arr.length && 0 <= j && j < arr[0].length && !visited[i][j];
    }

}
