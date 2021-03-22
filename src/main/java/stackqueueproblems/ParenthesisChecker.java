package stackqueueproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

/*
 Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
 Input: {([])}
 Output: true
 Input: ([]
 Output: false
*/

public class ParenthesisChecker {

    public static boolean validParenthesis(String input) {
        Stack<Character> symbolStack = new Stack<>();
        int inputLength = input.length();
        for (int i = 0; i < inputLength; i++) {
           char currentChar = input.charAt(i);
           if (currentChar == '}' || currentChar == ')' || currentChar == ']') {
               if (symbolStack.empty()) {
                   return false;
               } else {
                   char poppedChar = symbolStack.pop();
                   if (currentChar == '}' && poppedChar != '{')
                       return false;
                   else if (currentChar == ')' && poppedChar != '(')
                       return false;
                   else if (currentChar == ']' && poppedChar != '[')
                       return false;
               }
           } else {
               symbolStack.push(currentChar);
           }
        }

        return symbolStack.empty();
    }

    @Test
    public void test1() {
        Assertions.assertTrue(validParenthesis("{([])}"));
    }

    @Test
    public void test2() {
        Assertions.assertTrue(validParenthesis("()"));
    }

    @Test
    public void test3() {
        Assertions.assertFalse(validParenthesis("([]"));
    }

    @Test
    public void test4() {
        Assertions.assertFalse(validParenthesis("(]"));
    }

    @Test
    public void test5() {
        Assertions.assertFalse(validParenthesis("([)]"));
    }

    @Test
    public void test6() {
        Assertions.assertTrue(validParenthesis("{[]}"));
    }
}
