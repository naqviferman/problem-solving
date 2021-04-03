package hashingproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/*
Given an array of integers nums.
A pair (i,j) is called good if nums[i] == nums[j] and i < j.
Return the number of good pairs.
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good
*/

public class GoodPairs {

    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> pairMap = new HashMap<>();

        int goodPairs = 0;
        for (int num : nums) {
            if (pairMap.containsKey(num)) {
                int value = pairMap.get(num);
                goodPairs += value;
                pairMap.put(num, value + 1);
            } else {
                pairMap.put(num, 1);
            }
        }
        return goodPairs;
    }

    @Test
    public void test1() {
        Assertions.assertEquals(4, numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(6, numIdenticalPairs(new int[]{1, 1, 1, 1}));
    }
}
