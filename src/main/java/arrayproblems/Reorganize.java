package arrayproblems;

import java.util.Arrays;

public class Reorganize {
    /*
    Given an array of elements of length N, ranging from 0 to N – 1. All elements may not be present in the array.
    If the element is not present then there will be -1 present in the array.
    Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.

    Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
    Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

    Input : arr = {2, 0, 1}
    Output : [0, 1, 2]
    */
    public static void main(String[] args) {
        int[] input = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        rearrange(input);
        System.out.println(Arrays.toString(input));
    }

    private static void rearrange(int[] input) {
        int i = 0;
        while (i < input.length) {
            if (input[i] != -1) {
                int temp = input[input[i]];
                input[input[i]] = input[i];
                input[i] = temp;
                if (i != input[i])
                    i--;
            }
            i++;
        }
    }
}
