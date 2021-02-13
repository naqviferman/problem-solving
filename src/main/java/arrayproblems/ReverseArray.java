package arrayproblems;

import java.util.Arrays;

// Program to reverse an array
public class ReverseArray {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        reverseArray(input);
        System.out.println(Arrays.toString(input));
    }

    private static void reverseArray(int[] input) {

        for (int i = 0, j = input.length - 1; i < j; i++, j--) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
    }
}
