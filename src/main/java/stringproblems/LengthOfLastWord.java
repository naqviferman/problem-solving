package stringproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Given a string s consists of some words separated by spaces, return the length of the last word in the string.
If the last word does not exist, return 0
Input: s = "Hello World"
Output: 5
Input: s = " "
Output: 0
*/

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        String[] wordArray = s.split(" ");

        int arrLength = wordArray.length;
        if (arrLength > 0) {
            return wordArray[arrLength - 1].length();
        }

        return 0;
    }

    @Test
    public void test1() {
        Assertions.assertEquals(5, lengthOfLastWord("hello world"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(0, lengthOfLastWord(" "));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(0, lengthOfLastWord("        "));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(1, lengthOfLastWord("a"));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(1, lengthOfLastWord("a "));
    }

    
}
