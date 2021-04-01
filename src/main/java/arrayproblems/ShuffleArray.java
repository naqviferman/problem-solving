package arrayproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
*/
public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {
        int[] shuffledNums = new int[2 * n];
        for (int i = 0, j = 0, k = n; j < n; j++, k++) {
            shuffledNums[i++] = nums[j];
            shuffledNums[i++] = nums[k];
        }
        return shuffledNums;
    }

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3));
    }

}
