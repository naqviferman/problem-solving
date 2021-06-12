package arrayproblems.twodim;

import java.util.ArrayDeque;
import java.util.Deque;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        boolean[][] visited = new boolean[mat.length][mat[0].length];
        Integer[][] steps = {{0, 1}, {1, 0}, {0, -1}, {-1, -0}};
        Deque<Integer[]> deque = new ArrayDeque<>();
        for (Integer[] step : steps) {
            deque.offerLast(step);
        }

        getSpiral(mat, visited, deque, 0, 0);
    }

    private static void getSpiral(int[][] mat, boolean[][] visited, Deque<Integer[]> deque, int i, int j) {
        if (check(mat, visited, i, j)) {
            System.out.print(mat[i][j] + ", ");
            visited[i][j] = true;

            for (int k = 0; k < 4; k++) {
                Integer[] step = deque.peekFirst();
                int x = i + step[0];
                int y = j + step[1];
                getSpiral(mat, visited, deque, x, y);
                Integer[] first = deque.pollFirst();
                deque.offerLast(first);
            }
        }
    }

    private static boolean check(int[][] mat, boolean[][] visited, int i, int j) {
        return 0 <= i && i < mat.length && 0 <= j && j < mat[0].length && !visited[i][j];
    }
}
