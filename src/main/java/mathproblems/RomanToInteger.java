package mathproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Given a roman numeral, convert it to an integer.
Input: s = "III"
Output: 3
Input: s = "IV"
Output: 4
*/

public class RomanToInteger {

    HashMap<Character, Integer> romanMap = new HashMap<>();
    HashMap<Character, HashSet<Character>> romanExceptionMap = new HashMap<>();

    public RomanToInteger() {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        romanExceptionMap.put('I', new HashSet<>(Arrays.asList('V', 'X')));
        romanExceptionMap.put('X', new HashSet<>(Arrays.asList('L', 'C')));
        romanExceptionMap.put('C', new HashSet<>(Arrays.asList('D', 'M')));
    }

    public int romanToInt(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (romanExceptionMap.containsKey(ch) && i + 1 < s.length()) {
                HashSet<Character> exceptionSet = romanExceptionMap.get(ch);
                char nextChar = s.charAt(i + 1);
                if (exceptionSet.contains(nextChar)) {
                    res -= 2 * romanMap.get(ch);
                }
            }
            res += romanMap.get(ch);

        }
        return res;
    }

    @Test
    public void test1() {
        Assertions.assertEquals(3, romanToInt("III"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(4, romanToInt("IV"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(9, romanToInt("IX"));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(58, romanToInt("LVIII"));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(1994, romanToInt("MCMXCIV"));
    }
}
