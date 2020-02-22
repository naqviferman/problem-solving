package arrayproblems;

/*Write a function that takes an array of numbers (integers for the tests)
and a target number. It should find two different items in the array that,
when added together, give the target value. The indices of these items
should then be returned in a tuple like so: (index1, index2).*/

// twoSum ([1, 2, 3], 4) === (0, 2)

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{1, 2, 3}, 4);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            int sub = target - curr;
            if (map.containsKey(sub)) {
                return new int[]{map.get(sub), i};
            } else {
                map.put(curr, i);
            }
        }
        return null;
    }
}
