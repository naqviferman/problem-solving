package arrayproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them.
Notice that multiple kids can have the greatest number of candies.
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false]
Explanation: There is only 1 extra candy,
therefore only kid 1 will have the greatest number of candies among the kids regardless of who takes the extra candy.
*/
public class KidsWithMaxCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int greatest = -1;

        for (int candy : candies) {
            greatest = Math.max(candy, greatest);
        }

        for (int candy : candies) {
            int curr = candy + extraCandies;

            if (curr >= greatest) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

    @Test
    public void test1() {
        Assertions.assertEquals(Arrays.asList(true, true, true, false, true), kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(Arrays.asList(true, false, false, false, false), kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
    }
}
