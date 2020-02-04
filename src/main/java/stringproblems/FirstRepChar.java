package stringproblems;

import java.util.HashSet;
import java.util.Set;

public class FirstRepChar {
    public static void main(String[] args) {
        String input = "abab";
        System.out.println(firstRepeatedChar(input));
    }

    private static char firstRepeatedChar(String input) {
        Set<Character> set = new HashSet<>();
        for (char ch : input.toCharArray()) {
            if (!set.add(ch)) {
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }
}
