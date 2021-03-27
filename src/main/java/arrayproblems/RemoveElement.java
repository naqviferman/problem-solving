package arrayproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2]
For example if you return 2 with nums = [2,2,3,3] or nums = [2,2,0,0], your answer will be accepted.
It doesn't matter what you leave beyond the returned length.
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3]
*/

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int numsLength = nums.length;
        int i = 0;
        int j = numsLength - 1;

        while (i < j) {
            if (nums[i] != val) {
                i++;
            }
            if (nums[j] == val) {
                j--;
            }

            if (nums[i] == val && nums[j] != val && i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }

        if (i == j && nums[i] != val)
            return i + 1;

        return i;
    }

    @Test
    public void test1() {
        Assertions.assertEquals(2, removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(5, removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(0, removeElement(new int[]{1}, 1));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(0, removeElement(new int[]{3, 3}, 3));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(2, removeElement(new int[]{1, 2}, 3));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(0, removeElement(new int[]{3}, 3));
    }

    @Test
    public void test7() {
        Assertions.assertEquals(1, removeElement(new int[]{5}, 3));
    }

    @Test
    public void test8() {
        Assertions.assertEquals(1, removeElement(new int[]{5, 7, 7}, 7));
    }

    @Test
    public void test9() {
        Assertions.assertEquals(1, removeElement(new int[]{4, 5}, 4));
    }

    @Test
    public void test10() {
        Assertions.assertEquals(1, removeElement(new int[]{4, 5}, 5));
    }

    @Test
    public void test11() {
        Assertions.assertEquals(0, removeElement(new int[]{}, 4));
    }

    @Test
    public void test12() {
        Assertions.assertEquals(4, removeElement(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    public void test13() {
        Assertions.assertEquals(4, removeElement(new int[]{5, 1, 2, 3, 4}, 5));
    }

}
