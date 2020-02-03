package stringproblems;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatingCharSubstring {
    public static void main(String[] args) {
        String input = "abcdaeb";
        String longestNonRepCharSub = longestNonRepCharSub(input);
        System.out.println("longestNonRepCharSub = " + longestNonRepCharSub);
    }

    private static String longestNonRepCharSub(String input) {
        Map<Character, Integer> dupMap = new HashMap<>();
        String result = "";
        String currRes;
        int start = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (dupMap.containsKey(ch)) {
                int oldDupIndex = dupMap.get(ch);
                if (oldDupIndex >= start) {
                    currRes = input.substring(start, i);
                    start = oldDupIndex + 1;
                    if (currRes.length() > result.length()) {
                        result = currRes;
                    }
                }
            }
            dupMap.put(ch, i);
        }

        currRes = input.substring(start);       // input.substring(start, input.length());
        if (currRes.length() > result.length()) {
            result = currRes;
        }

        return result;
    }
}
