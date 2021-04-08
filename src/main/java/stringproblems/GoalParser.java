package stringproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*You own a Goal Parser that can interpret a string command.
The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.
Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
Input: command = "G()()()()(al)"
Output: "Gooooal"
Input: command = "(al)G(al)()()G"
Output: "alGalooG"
*/
public class GoalParser {

    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    @Test
    public void test1() {
        Assertions.assertEquals("Goal", interpret("G()(al)"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("alGalooG", interpret("(al)G(al)()()G"));
    }
}
