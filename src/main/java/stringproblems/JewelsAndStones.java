package stringproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Input: jewels = "z", stones = "ZZ"
Output: 0
*/

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        String stonesCopy = stones;
        for (int i = 0; i < jewels.length(); i++) {
            String jewel = String.valueOf(jewels.charAt(i));
            stonesCopy = stonesCopy.replace(jewel, "");
        }

        return stones.length() - stonesCopy.length();
    }

    @Test
    public void test1() {
        Assertions.assertEquals(3,numJewelsInStones("aA", "aAAbbbb"));
    }
}
