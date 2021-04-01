package arrayproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1]
*/
public class RunningSum {

    public int[] runningSum(int[] nums) {

        int numsLength = nums.length;

        if (numsLength <= 1)
            return nums;

        for (int i = 1; i < numsLength; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[]{1, 3, 6, 10}, runningSum(new int[]{1, 2, 3, 4}));
    }
}
