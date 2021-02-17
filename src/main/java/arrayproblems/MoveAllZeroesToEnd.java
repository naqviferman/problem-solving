package arrayproblems;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] input = {1, 2, 0, 0, 0, 3, 6};
//        int[]  input = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
//        int[] input = {0, 0, 0, 4};
        System.out.println(Arrays.toString(input));
        moveAllZeroes(input);
        System.out.println(Arrays.toString(input));
    }

    private static void moveAllZeroes(int[] input) {
        int i = 0;
        int j = 0;

        while (i < input.length) {
            if (input[i] != 0) {
                if (i != j) {
                    input[j] = input[i];
                    input[i] = 0;
                }
                i++;
                j++;
            } else {
                i++;
            }
        }
    }

}
