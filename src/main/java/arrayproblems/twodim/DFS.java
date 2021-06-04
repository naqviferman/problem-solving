package arrayproblems.twodim;

public class DFS {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};

        boolean[][] visited = new boolean[arr.length][arr[0].length];

        int[][] steps = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        visited[0][0] = true;
        dfs(arr, visited, steps, 0, 0);
    }

    private static void dfs(int[][] arr, boolean[][] visited, int[][] steps, int i, int j) {
        System.out.println(arr[i][j]);
        for (int[] step : steps) {
            int x = step[0] + i;
            int y = step[1] + j;
            if (check(arr, visited, x, y)) {
                visited[x][y] = true;
                dfs(arr, visited, steps, x, y);
            }
        }
    }

    private static boolean check(int[][] arr, boolean[][] visited, int i, int j) {
        return 0 <= i && i < arr.length && 0 <= j && j < arr[0].length && !visited[i][j];
    }
}
