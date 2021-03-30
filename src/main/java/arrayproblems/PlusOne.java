package arrayproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer
You may assume the integer does not contain any leading zero, except the number 0 itself.
Input: digits = [1,2,3]
Output: [1,2,4]
Input: digits = [0]
Output: [1]
*/

public class PlusOne {
    
    public int[] plusOne(int[] digits) {

        int digitsLength = digits.length;

        for (int i = digitsLength - 1; i >= 0; i--) {
            int lsd = digits[i];

            if (lsd != 9) {
                digits[i] = lsd + 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digitsLength + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[]{1,2,4}, plusOne(new int[]{1,2,3}));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new int[]{4,3,2,2}, plusOne(new int[]{4,3,2,1}));
    }

    @Test
    public void test3() {
        Assertions.assertArrayEquals(new int[]{1}, plusOne(new int[]{0}));
    }

    @Test
    public void test4() {
        Assertions.assertArrayEquals(new int[]{1,0,0,0}, plusOne(new int[]{9,9,9}));
    }
}
