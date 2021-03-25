package arrayproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDupFromSortedArray {

    public int removeDuplicates(int[] input) {
        int inputLength = input.length;

        if (inputLength < 2)
            return inputLength;

        int i = 0;
        for (int j = 1; j < inputLength; j++) {
            if (input[i] != input[j]) {
                input[++i] = input[j];
            }
        }
        return i + 1;
    }

    @Test
    public void test1() {
        Assertions.assertEquals(2, removeDuplicates(new int[]{1, 1, 2}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(5, removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(1, removeDuplicates(new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(5, removeDuplicates(new int[]{1, 2, 2, 3, 4, 4, 4, 5, 5}));
    }
}
