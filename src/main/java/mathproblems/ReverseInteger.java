package mathproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0
Input: x = 123
Output: 321
Input: x = -123
Output: -321
Input: x = 1534236469
Output: 0
*/

public class ReverseInteger {

    public int reverse(int x) {

        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x *= -1;
        }

        int rev = 0;
        int rem;

        while (x > 0) {
            rem = x % 10;
            if (rev > (Integer.MAX_VALUE - rem) / 10)
                return 0;
            rev = rev * 10 + rem;
            x /= 10;
        }

        return isNegative ? -rev : rev;
    }


    @Test
    public void test1() {
        Assertions.assertEquals(321, reverse(123));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(-321, reverse(-123));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(0, reverse(0));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(0, reverse(1534236469));
    }

}
